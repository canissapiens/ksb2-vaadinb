package pl.mirek.ksb2vaadinb.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

// endpointa w Vaadinie podaje się bez początkowego "/"
@Route("hello")
public class HelloGui extends VerticalLayout {

    public HelloGui() {
        TextField labelField = new TextField();
        // labelField.setLabel("Get name");
        labelField.setPlaceholder("name");
        // labelField.setValue("Value");

        Button rightButton = new Button("Right",
                new Icon(VaadinIcon.HANDSHAKE));
        rightButton.setIconAfterText(true);

        rightButton.addClickListener(event -> {

            Dialog dialog = new Dialog();

            dialog.setWidth("400px");
            dialog.setHeight("150px");

            dialog.add(new Label("Hello " + labelField.getValue()));
            dialog.open();
        });

        add(labelField);
        add(rightButton);
    }

}
