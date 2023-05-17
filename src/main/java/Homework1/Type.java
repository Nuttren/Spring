package Homework1;

public enum Type {
    CAR("Автомобиль"),
    PICKUP("Пикап"),
    BUS ("Автобус");

    public String getType() {
        return type;
    }

    Type(String type) {
        this.type = type;
    }

    private String type;
}
