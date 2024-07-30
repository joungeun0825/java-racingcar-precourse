package racingcar.type;

import racingcar.domain.Car;

public enum PositionType {
    POSITION("-");

    private String position;
    PositionType(String position){
        this.position = position;
    }
    public String getPosition(Car car){
        String str = car.getName() + " : ";
        for(int i = 0; i<car.getPosition(); i++){
            str += position;
        }
        return str;
    }
}
