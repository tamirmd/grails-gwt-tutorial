package org.ducktools.grailstube.client.injection;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import org.ducktools.grailstube.client.ui.VideoDetailsPresenter;
import org.ducktools.grailstube.client.ui.VideoListPresenter;

/**
 * @author Jan Ehrhardt
 */
@GinModules({VideoModule.class, ActionServiceModule.class})
public interface Application extends Ginjector {

  VideoDetailsPresenter getVideoDetails();

  VideoListPresenter getVideoList();

}
