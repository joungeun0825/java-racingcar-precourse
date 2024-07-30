package racingcar.type;

public enum ExceptionType {

    INVALID_LENGTH("자동차 이름의 길이는 5글자 이하여야 한다."),
    INVALID_NUM("시도 횟수는 숫자여야 한다.");

    private String exception;

    ExceptionType(String exception){
        this.exception = exception;
    }

    public String getException(){
        return "[ERROR]" + exception;
    }
}
