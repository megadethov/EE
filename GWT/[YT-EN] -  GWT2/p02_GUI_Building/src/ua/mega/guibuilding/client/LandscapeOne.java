package ua.mega.guibuilding.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LandscapeOne extends Composite {

    VerticalPanel vPanel = new VerticalPanel();

    public LandscapeOne() {
        initWidget(vPanel);

        Image image1 = new Image("/img/oracle.png");
//        image.setWidth("600%");
        image1.setWidth("600px");

        this.vPanel.add(image1);
    }
}
