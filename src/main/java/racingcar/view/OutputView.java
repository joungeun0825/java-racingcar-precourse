package racingcar.view;

import racingcar.domain.Car;
import racingcar.service.GameService;
import racingcar.type.ExceptionType;
import racingcar.type.PositionType;
import racingcar.type.TextType;

import java.util.ArrayList;

public class OutputView {
    public static void getCarName(){
        System.out.println(TextType.GET_CAR_NAME.getText());
    }
    public static void getTryNum(){
        System.out.println(TextType.GET_TRY_NUM.getText());
    }

    public static String printInvalidLengthException(){
        return ExceptionType.INVALID_LENGTH.getException();
    }

    public static String printInvalidNumException(){
        return ExceptionType.INVALID_NUM.getException();
    }

    public static void printCurrentPosition(ArrayList<Car> cars){
        for(Car car : cars){
            System.out.println(PositionType.POSITION.getPosition(car));
        }
        System.out.println();
    }

    public static void printResult(){
        System.out.println(TextType.PRINT_RESULT.getText());
    }

    public static void printWinner(ArrayList<Car> cars){
        System.out.print(TextType.WINNER.getText());
        ArrayList<String> winners = GameService.getResult(cars);
        for(int i = 0; i<winners.size()-1; i++){
            System.out.print(" " + winners.get(i) + ",");
        }
        System.out.println(" " + winners.get(winners.size()-1));
    }
}
