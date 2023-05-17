package Homework1;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Car extends Transport{
    public Car(String brand, String model, double engineSize, Type type) {
        super(brand, model, engineSize);

    }
    public void start() {
        System.out.println(Type.CAR.getType() + " готов к работе");
    }
}
