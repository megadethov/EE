package ua.mega.guibuilding.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class MyFlexTableWidget extends Composite {
    private HorizontalPanel hPanel = new HorizontalPanel();

    public MyFlexTableWidget() {
        initWidget(this.hPanel);


    FlexTable fTable = new FlexTable();
    fTable.setBorderWidth(1);

    Label label1 = new Label("1");
    Label label2 = new Label("2");
    Label label3 = new Label("3");
    Label label4 = new Label("4");

    fTable.setWidget(0,0,label1);
    fTable.setWidget(0,1,label2);
    fTable.setWidget(1,0,label3);
    fTable.setWidget(1,1,label4);

    hPanel.add(fTable);
}}
