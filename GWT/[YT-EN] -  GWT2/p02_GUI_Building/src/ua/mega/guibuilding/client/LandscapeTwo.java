package ua.mega.guibuilding.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LandscapeTwo extends Composite {

    VerticalPanel vPanel = new VerticalPanel();

    public LandscapeTwo() {
        initWidget(vPanel);

        Image image2 = new Image("/img/postgres.png");
//        image2.setWidth("600%");
        image2.setWidth("600px");
        
        this.vPanel.add(image2);
    }
}
