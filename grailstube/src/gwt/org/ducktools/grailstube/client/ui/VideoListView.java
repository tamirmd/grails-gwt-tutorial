package org.ducktools.grailstube.client.ui;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * @author Jan Ehrhardt
 */
public class VideoListView implements View {

  private final VerticalPanel listPanel;

  public VideoListView() {
    listPanel = new VerticalPanel();
  }

  public void bintTo(HasWidgets hasWidgets) {
    hasWidgets.add(listPanel);
  }
  
}
