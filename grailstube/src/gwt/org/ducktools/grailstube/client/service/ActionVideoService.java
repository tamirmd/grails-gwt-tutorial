package org.ducktools.grailstube.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import grails.plugins.gwt.client.GwtActionServiceAsync;
import org.ducktools.grailstube.client.GetVideoAction;
import org.ducktools.grailstube.client.GetVideoResponse;
import org.ducktools.grailstube.client.event.EventBus;

/**
 * @author Jan Ehrhardt
 */
public class ActionVideoService implements VideoService {

  private final GwtActionServiceAsync actionService;

  private final EventBus eventBus;

  @Inject
  public ActionVideoService(GwtActionServiceAsync actionService, EventBus eventBus) {
    this.actionService = actionService;
    this.eventBus = eventBus;
  }

  public void callForVideo(String title) {

    GetVideoAction action = new GetVideoAction();
    action.setTitle(title);

    actionService.execute(action, new AsyncCallback<GetVideoResponse>() {

      public void onFailure(Throwable throwable) {

      }

      public void onSuccess(GetVideoResponse getVideoResponse) {

      }

    });

  }

}
