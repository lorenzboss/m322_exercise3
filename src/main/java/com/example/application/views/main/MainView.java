package com.example.application.views.main;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("main view")
@Route(value = "")
public class MainView extends VerticalLayout {
    public MainView() {
        TextField firstname = new TextField("Firstname*");
        TextField surname = new TextField("Surname*");
        Button confirmButton = new Button("Confirm");
        Button nextPageButton = new Button("Go to second page");
        Paragraph helloName = new Paragraph();

        confirmButton.addClickListener(event -> helloName.setText("hey " + firstname.getValue().trim().toLowerCase() + " " + surname.getValue().trim().toLowerCase()));

        nextPageButton.addClickListener(event -> getUI().ifPresent(ui -> ui.navigate(SecondView.class)));

        // Test
        add(firstname, surname, confirmButton, helloName, nextPageButton);
    }
}
