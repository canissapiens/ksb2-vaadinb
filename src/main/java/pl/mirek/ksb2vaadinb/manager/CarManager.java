package pl.mirek.ksb2vaadinb.manager;


import org.springframework.stereotype.Service;
import pl.mirek.ksb2vaadinb.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager {
    private List<Car> carList;

    public CarManager() {
        carList = new ArrayList<>();
        carList.add(new Car("Fiat", "126p"));
        carList.add(new Car("BMW", "X1"));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public void addCar(Car car) {
        carList.add(car);
    }
}
