package org.ducktools.grailstube.client.entry;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import org.ducktools.grailstube.client.injection.Application;

/**
 * @author Jan Ehrhardt
 */
public class VideoApplication implements EntryPoint {

  private final Application application = GWT.create(Application.class);

  public void onModuleLoad() {

    HorizontalPanel applicationPanel = new HorizontalPanel();
    RootPanel.get().add(applicationPanel);

    application.getVideoList().getView().bintTo(applicationPanel);
    application.getVideoDetails().getView().bintTo(applicationPanel);

  }

}
