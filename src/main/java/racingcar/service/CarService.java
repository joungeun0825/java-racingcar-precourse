package racingcar.service;

import racingcar.domain.Car;
import racingcar.type.BoundaryType;
import racingcar.view.OutputView;

import java.util.ArrayList;

public class CarService {

    public static ArrayList<Car> cars = new ArrayList<>();

    public static ArrayList<Car> makeCar(String inputCars){
        String[] carsArr = inputCars.split(",");

        for(String car : carsArr){
            if(isValidCar(car)) {
                cars.add(new Car(car));
            }
        }
        return cars;
    }

    public static boolean isValidCar(String car){
        if(car.length() <= BoundaryType.CAR_LENGTH.getBoundary()) return true;
        throw new IllegalArgumentException(OutputView.printInvalidLengthException());
    }

}
