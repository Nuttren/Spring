package Homework1;

import org.springframework.stereotype.Component;

@Component
public class Bus extends Transport{
    public Bus(String brand, String model, double engineSize, Type type) {
        super(brand, model, engineSize);
    }

    public void start() {
        System.out.println(Type.BUS.getType() + " готов к работе");
    }
}
