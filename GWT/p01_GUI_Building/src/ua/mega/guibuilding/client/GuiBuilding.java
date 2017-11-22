package ua.mega.guibuilding.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class GuiBuilding implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        VerticalPanel vPanel = new VerticalPanel();
        Label label = new Label("Label text !!!");
        Button btn = new Button("click me");

        vPanel.add(label);
        vPanel.add(btn);

        RootPanel.get().add(vPanel);
    }
}
