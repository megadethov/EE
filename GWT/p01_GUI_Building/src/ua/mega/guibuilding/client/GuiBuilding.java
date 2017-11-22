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
        vPanel.setBorderWidth(1);

        Label label = new Label("Label text !!!");
        Button btn = new Button("click me");
        Image img = new Image("img/1030 - Struts validator.png");
        TextBox tBox = new TextBox();

        HorizontalPanel hPanel = new HorizontalPanel();
        hPanel.setBorderWidth(3);

        vPanel.add(img);
        vPanel.add(label);

        hPanel.add(tBox);
        hPanel.add(btn);
        vPanel.add(hPanel);

        RootPanel.get().add(vPanel);
    }
}
