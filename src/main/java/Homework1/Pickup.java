package Homework1;

import org.springframework.stereotype.Component;

@Component
public class Pickup extends Transport{
    public Pickup(String brand, String model, double engineSize, Type type) {
        super(brand, model, engineSize);
    }

    public void start() {
        System.out.println(Type.PICKUP.getType() + " готов к работе");
    }
}
