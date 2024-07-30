package racingcar.domain;

import racingcar.view.OutputView;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public void movePosition(int randNum){
        if(randNum >= 4){
            this.position += randNum;
        }
    }

    public int getPosition(){
        return position;
    }

    public String getName(){
        return name;
    }
}
