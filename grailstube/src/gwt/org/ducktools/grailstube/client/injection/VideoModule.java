package org.ducktools.grailstube.client.injection;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import org.ducktools.grailstube.client.event.EventBus;
import org.ducktools.grailstube.client.ui.VideoDetailsPresenter;
import org.ducktools.grailstube.client.ui.VideoDetailsView;
import org.ducktools.grailstube.client.ui.VideoListPresenter;
import org.ducktools.grailstube.client.ui.VideoListView;

/**
 * @author Jan Ehrhardt
 */
public class VideoModule extends AbstractGinModule {

  protected void configure() {

    bind(EventBus.class).in(Singleton.class);

    bind(VideoListView.class);
    bind(VideoListPresenter.class);

    bind(VideoDetailsView.class);
    bind(VideoDetailsPresenter.class);

  }

}
