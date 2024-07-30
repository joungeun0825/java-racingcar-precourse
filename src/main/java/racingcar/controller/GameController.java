package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Number;
import racingcar.service.CarService;
import racingcar.service.GameService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;

public class GameController {
    public static void initGame(){
        OutputView.getCarName();
        ArrayList<Car> cars = CarService.makeCar(InputView.scan());
        OutputView.getTryNum();
        Number number = new Number(InputView.scan());
        playGame(number,cars);
    }

    public static void playGame(Number number, ArrayList<Car> cars){
        OutputView.printResult();
        for(int i = 0; i < number.getNum(); i++){
            GameService.playGame(cars);
            OutputView.printCurrentPosition(cars);
        }
        OutputView.printWinner(cars);
    }
}
