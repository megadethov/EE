package ua.mega.guibuilding.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LandscapeOne extends Composite {

    private VerticalPanel vPanel = new VerticalPanel();
    private MainView main;

    public LandscapeOne(MainView main) {
        initWidget(vPanel);
        this.main = main;

        Image image1 = new Image("/img/oracle.png");
//        image.setWidth("600%");
        image1.setWidth("600px");

        this.vPanel.add(image1);

        Anchor anchor1 = new Anchor("Go to Landscape Two");
        anchor1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                main.openLandscape2();
            }
        });
        this.vPanel.add(anchor1);
    }

}
