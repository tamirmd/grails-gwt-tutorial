import org.ducktools.grailstube.Video

/**
 * @author Jan Ehrhardt
 */
class BootStrap {

  def init = {servletContext ->
    new Video(title: "Google I/O 2009 - Groovy and Grails in App Engine", lenght: 60.14f, url: "http://www.youtube.com/watch?v=NEnniZTdOYk")
  }

  def destroy = {
  }

} 