package org.ducktools.grailstube

import org.ducktools.grailstube.Video
import org.springframework.dao.DataIntegrityViolationException

/**
 * @author Jan Ehrhardt
 */
class VideoController {

  def index = { render(view: "show") }

  // the delete, save and update actions only accept POST requests
  static allowedMethods = [delete: 'POST', save: 'POST', update: 'POST']

  def list = {
    params.max = Math.min(params.max ? params.max.toInteger() : 10, 100)
    [videoInstanceList: Video.list(params), videoInstanceTotal: Video.count()]
  }

  def show = {
    def videoInstance = Video.get(params.id)

    if (!videoInstance) {
      flash.message = "Video not found with id ${params.id}"
      redirect(action: list)
    }
    else { return [videoInstance: videoInstance] }
  }

  def delete = {
    def videoInstance = Video.get(params.id)
    if (videoInstance) {
      try {
        videoInstance.delete(flush: true)
        flash.message = "Video ${params.id} deleted"
        redirect(action: list)
      }
      catch (org.springframework.dao.DataIntegrityViolationException e) {
        flash.message = "Video ${params.id} could not be deleted"
        redirect(action: show, id: params.id)
      }
    }
    else {
      flash.message = "Video not found with id ${params.id}"
      redirect(action: list)
    }
  }

  def edit = {
    def videoInstance = Video.get(params.id)

    if (!videoInstance) {
      flash.message = "Video not found with id ${params.id}"
      redirect(action: list)
    }
    else {
      return [videoInstance: videoInstance]
    }
  }

  def update = {
    def videoInstance = Video.get(params.id)
    if (videoInstance) {
      if (params.version) {
        def version = params.version.toLong()
        if (videoInstance.version > version) {

          videoInstance.errors.rejectValue("version", "video.optimistic.locking.failure", "Another user has updated this Video while you were editing.")
          render(view: 'edit', model: [videoInstance: videoInstance])
          return
        }
      }
      videoInstance.properties = params
      if (!videoInstance.hasErrors() && videoInstance.save()) {
        flash.message = "Video ${params.id} updated"
        redirect(action: show, id: videoInstance.id)
      }
      else {
        render(view: 'edit', model: [videoInstance: videoInstance])
      }
    }
    else {
      flash.message = "Video not found with id ${params.id}"
      redirect(action: list)
    }
  }

  def create = {
    def videoInstance = new Video()
    videoInstance.properties = params
    return ['videoInstance': videoInstance]
  }

  def save = {
    def videoInstance = new Video(params)
    if (!videoInstance.hasErrors() && videoInstance.save()) {
      flash.message = "Video ${videoInstance.id} created"
      redirect(action: show, id: videoInstance.id)
    }
    else {
      render(view: 'create', model: [videoInstance: videoInstance])
    }
  }

}
