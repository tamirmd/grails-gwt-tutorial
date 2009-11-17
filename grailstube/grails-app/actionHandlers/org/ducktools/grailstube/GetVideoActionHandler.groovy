package org.ducktools.grailstube

import org.ducktools.grailstube.client.GetVideoAction
import org.ducktools.grailstube.client.GetVideoResponse

/**
 * @author Jan Ehrhardt
 */
class GetVideoActionHandler {

  VideoService videoService

  GetVideoResponse execute(GetVideoAction action) {

    Video video = videoService.getVideo(action.title)

    GetVideoResponse response = new GetVideoResponse()
    response.length = video.lenght
    response.url = video.url

    return response
    
  }

}
