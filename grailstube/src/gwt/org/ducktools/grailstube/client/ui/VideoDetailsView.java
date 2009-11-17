package org.ducktools.grailstube.client.ui;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * @author Jan Ehrhardt
 */
public class VideoDetailsView implements View {

  private final Label title;

  private final Label length;

  public VideoDetailsView() {
    title = new Label();
    length = new Label();
  }

  public void bintTo(HasWidgets hasWidgets) {

    VerticalPanel detailsPanel = new VerticalPanel();
    hasWidgets.add(detailsPanel);

    detailsPanel.add(title);
    detailsPanel.add(length);

  }

}
