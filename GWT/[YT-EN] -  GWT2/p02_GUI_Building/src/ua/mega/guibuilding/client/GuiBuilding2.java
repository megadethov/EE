package ua.mega.guibuilding.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class GuiBuilding2 implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        MainView mainView = new MainView();
        RootPanel.get().add(mainView);
    }
}
