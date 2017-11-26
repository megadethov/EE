package ua.mega.guibuilding.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {
    private VerticalPanel vPanel = new VerticalPanel();
    private VerticalPanel contentPanel;

    public MainView() {
        initWidget(this.vPanel);
        this.vPanel.setBorderWidth(1);

        MenuView menu = new MenuView();
        this.vPanel.add(menu);

        this.contentPanel = new VerticalPanel();

        this.vPanel.add(contentPanel);
    }
}
