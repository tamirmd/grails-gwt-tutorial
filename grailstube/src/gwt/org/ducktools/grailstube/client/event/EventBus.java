package org.ducktools.grailstube.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * @author Jan Ehrhardt
 */
public class EventBus {

  private final HandlerManager handlerManager;

  public EventBus() {
    handlerManager = new HandlerManager(this);
  }

  public <H extends EventHandler> HandlerRegistration addHandler(GwtEvent.Type<H> hType, H h) {
    return handlerManager.addHandler(hType, h);
  }

  public void fireEvent(GwtEvent<?> gwtEvent) {
    handlerManager.fireEvent(gwtEvent);
  }

}
