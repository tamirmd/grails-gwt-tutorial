package org.ducktools.grailstube.client;

import grails.plugins.gwt.shared.Action;

/**
 * @author Jan Ehrhardt
 */
public class GetVideoAction implements Action<GetVideoResponse> {
  
  private static final long serialVersionUID = 1L;

  private String title;

  public GetVideoAction() {

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
  
}
