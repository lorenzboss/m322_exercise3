package com.example.application.views.main;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@PageTitle("second view")
@Route(value = "second")
public class SecondView extends VerticalLayout {
    public SecondView() {
        Paragraph explanation = new Paragraph("This ist just an empty View, if you want you can go to the main view.");
        RouterLink link = new RouterLink("MainView", MainView.class);

        add(explanation, link);
    }
}
