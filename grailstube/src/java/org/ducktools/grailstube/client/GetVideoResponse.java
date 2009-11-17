package org.ducktools.grailstube.client;

import grails.plugins.gwt.shared.Response;

/**
 * @author Jan Ehrhardt
 */
public class GetVideoResponse implements Response {

  private static final long serialVersionUID = 1L;

  private float length;

  private String url;

  public GetVideoResponse() {

  }

  public float getLength() {
    return length;
  }

  public void setLength(float length) {
    this.length = length;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
