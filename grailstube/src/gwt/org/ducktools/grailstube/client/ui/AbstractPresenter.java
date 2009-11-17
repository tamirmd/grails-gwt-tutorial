package org.ducktools.grailstube.client.ui;

/**
 * @author Jan Ehrhardt
 */
public abstract class AbstractPresenter<T extends View> {

  protected final T view;

  public AbstractPresenter(T view) {
    this.view = view;
  }

  public T getView() {
    return view;
  }

}
