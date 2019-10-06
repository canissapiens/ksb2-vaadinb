package pl.mirek.ksb2vaadinb.gui;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mirek.ksb2vaadinb.manager.CarManager;
import pl.mirek.ksb2vaadinb.model.Car;

@Route("show-car")
public class CarShowGui extends VerticalLayout {

    private CarManager carManager;

    @Autowired
    public CarShowGui(CarManager carManager) {
        this.carManager = carManager;
        FormLayout nameLayout = new FormLayout();

        Grid<Car> gridCar = new Grid<>(Car.class);
        gridCar.setItems(carManager.getCarList());
        // gridCar.removeColumnByKey("id");
        nameLayout.add(gridCar);
        nameLayout.setResponsiveSteps(
                new ResponsiveStep("25em", 1),
                new ResponsiveStep("32em", 2),
                new ResponsiveStep("40em", 3));
        add(nameLayout);

    }


}
