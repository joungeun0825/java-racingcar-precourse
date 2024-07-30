package racingcar.domain;

import racingcar.type.BoundaryType;
import racingcar.view.OutputView;

public class Number {
    private int num;

    public Number(String num){
        isValidNum(num);
        this.num = Integer.parseInt(num);
    }

    public int getNum(){
        return num;
    }

    public boolean isValidNum(String num){
        if(BoundaryType.MINIMUM_ASCII.getBoundary() <= num.charAt(0) && num.charAt(0) <= BoundaryType.MAXIMUM_ASCII.getBoundary()) return true;
        throw new IllegalArgumentException(OutputView.printInvalidNumException());
    }
}
