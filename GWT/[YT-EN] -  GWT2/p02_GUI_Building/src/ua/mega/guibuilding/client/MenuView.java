package ua.mega.guibuilding.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class MenuView extends Composite{
    HorizontalPanel hPanel = new HorizontalPanel();

    public MenuView() {
        initWidget(hPanel);

        Button landscapeBtn1 = new Button("Landscape 1");
        landscapeBtn1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

            }
        });
        this.hPanel.add(landscapeBtn1);

        Button landscapeBtn2 = new Button("Landscape 2");
        landscapeBtn2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

            }
        });
        this.hPanel.add(landscapeBtn2);
    }
}
