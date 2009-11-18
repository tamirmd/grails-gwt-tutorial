package org.ducktools.grailstube.client.ui;

import com.google.inject.Inject;
import org.ducktools.grailstube.client.event.EventBus;
import org.ducktools.grailstube.client.service.VideoService;

/**
 * @author Jan Ehrhardt
 */
public class VideoDetailsPresenter extends AbstractPresenter<VideoDetailsView> {

  private final EventBus eventBus;

  private final VideoService videoService;

  @Inject
  public VideoDetailsPresenter(VideoDetailsView view, EventBus eventBus, VideoService videoService) {

    super(view);

    this.eventBus = eventBus;
    this.videoService = videoService;

  }

}
