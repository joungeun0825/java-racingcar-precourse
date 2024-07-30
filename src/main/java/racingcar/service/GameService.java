package racingcar.service;

import racingcar.domain.Car;
import java.util.ArrayList;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class GameService {
    private static int randNum;
    public static void playGame(ArrayList<Car> cars){
        for(Car car : cars){
            randNum = pickNumberInRange(0,9);
            car.movePosition(randNum);
        }
    }

    public static ArrayList<String> getResult(ArrayList<Car> cars){
        int maxPosition = getMaxPosition(cars);
        return getWinner(maxPosition,cars);
    }

    public static int getMaxPosition(ArrayList<Car> cars){
        int maxPosition = -1;
        for(Car car : cars){
            if(maxPosition < car.getPosition()){
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    public static ArrayList<String> getWinner(int maxPosition, ArrayList<Car> cars){
        ArrayList<String> winners = new ArrayList<>();
        for(Car car : cars){
            if(car.getPosition() == maxPosition){
                winners.add(car.getName());
            }
        }
        return winners;
    }
}
