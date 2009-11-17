package org.ducktools.grailstube.client.injection;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import org.ducktools.grailstube.client.service.VideoService;
import org.ducktools.grailstube.client.service.ActionVideoService;

/**
 * @author Jan Ehrhardt
 */
public class ActionServiceModule extends AbstractGinModule {

  protected void configure() {
    bind(VideoService.class).to(ActionVideoService.class).in(Singleton.class);
  }
  
}
