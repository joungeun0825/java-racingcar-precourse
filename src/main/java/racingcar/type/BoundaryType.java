package racingcar.type;

public enum BoundaryType {

    CAR_LENGTH(5),
    MINIMUM_ASCII(49),
    MAXIMUM_ASCII(57);

    private final int boundary;

    BoundaryType(int boundary) {
        this.boundary = boundary;
    }

    public int getBoundary() {
        return boundary;
    }
}
