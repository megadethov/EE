package ua.mega.guibuilding.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LandscapeTwo extends Composite {

    private VerticalPanel vPanel = new VerticalPanel();
    private MainView main;

    public LandscapeTwo(MainView main) {
        initWidget(vPanel);
        this.main = main;

        Image image2 = new Image("/img/postgres.png");
//        image2.setWidth("600%");
        image2.setWidth("600px");
        
        this.vPanel.add(image2);

        Anchor anchor2 = new Anchor("Go to Landscape One");
        anchor2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                main.openLandscape1();
            }
        });
        this.vPanel.add(anchor2);
    }
}
