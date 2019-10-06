package pl.mirek.ksb2vaadinb.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mirek.ksb2vaadinb.manager.CarManager;
import pl.mirek.ksb2vaadinb.model.Car;

@Route("add-car")
public class CarAdderGui extends VerticalLayout {

    private CarManager carManager;

    @Autowired
    public CarAdderGui(CarManager carManager) {
        this.carManager = carManager;
        TextField textFieldMark = new TextField();
        textFieldMark.setLabel("Mark:");
        TextField textFieldModel = new TextField();
        textFieldModel.setLabel("Model");
        Button buttonAdd = new Button();

        add(textFieldMark, textFieldModel, buttonAdd);

        buttonAdd.addClickListener(clickEvent -> {
            Car car = new Car(textFieldMark.getValue(), textFieldModel.getValue());
            carManager.addCar(car);
            carManager.getCarList().forEach(System.out::println);
        });

    }


}
