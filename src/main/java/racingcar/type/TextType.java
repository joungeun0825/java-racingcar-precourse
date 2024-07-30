package racingcar.type;


public enum TextType {
    GET_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    GET_TRY_NUM("시도할 회수는 몇회인가요?"),
    PRINT_RESULT("실행 결과"),
    WINNER("최종 우승자 : ");

    private final String text;
    TextType(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}
