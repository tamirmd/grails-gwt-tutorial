package org.ducktools.grailstube

/**
 * @author Jan Ehrhardt
 */
class Video {

  String title

  float lenght

  String url

  static constraints = {
    title(unique: true)
  }
  
}
