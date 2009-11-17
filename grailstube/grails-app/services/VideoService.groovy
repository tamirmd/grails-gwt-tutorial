/**
 * @author Jan Ehrhardt
 */
class VideoService {

  boolean transactional = true

  def getVideo(String title) {
    return VideoService.findByTitle(title)
  }
  
}
