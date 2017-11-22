package ua.mega.guibuilding.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;

public class MyWidget extends Composite {

    private VerticalPanel vPanel = new VerticalPanel();

    public MyWidget() {
        initWidget(this.vPanel);

        Label label = new Label("Label text !!!");
        Button btn = new Button("click me");

        Image img = new Image("img/1030 - Struts validator.png");
        TextBox tBox = new TextBox();

        HorizontalPanel hPanel = new HorizontalPanel();
        hPanel.setBorderWidth(3);

        btn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                String text = tBox.getText();
                label.setText(text);
            }
        });

        vPanel.add(img);
        vPanel.add(label);

        hPanel.add(tBox);
        hPanel.add(btn);
        vPanel.add(hPanel);
    }
}
