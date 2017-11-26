package ua.mega.guibuilding.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {
    private VerticalPanel vPanel = new VerticalPanel();
    private VerticalPanel contentPanel;

    public MainView() {
        initWidget(this.vPanel);
        this.vPanel.setBorderWidth(1);

        MenuView menu = new MenuView(this);
        this.vPanel.add(menu);

        this.contentPanel = new VerticalPanel();
        this.vPanel.add(contentPanel);

        Label textLbl = new Label("Press button to see landscape");
        this.vPanel.add(textLbl);
    }

    public void openLandscape1() {
        this.contentPanel.clear(); //  очистить панель от предыдущего вида
        LandscapeOne page1 = new LandscapeOne(this);
        this.contentPanel.add(page1);
    }
    public void openLandscape2() {
        this.contentPanel.clear(); //  очистить панель от предыдущего вида
        LandscapeTwo page2 = new LandscapeTwo(this);
        this.contentPanel.add(page2);
    }
}
