package Homework1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car getCarBean() {
        return new Car("BMW", "X5", 6.3, Type.CAR);
    }

    @Bean
    public Bus getBusBean () {
        return new Bus ("Volvo", "2023", 5.2, Type.BUS);
    }

    @Bean
    public Pickup getPickupBean () {
        return new Pickup ("Toyota", "Tundra", 7.2, Type.PICKUP);
    }

    @Bean (name = "carDriver")
    public Driver getCarDriver () {
        return  new Driver("Федор", getCarBean());
    }

    @Bean (name = "busDriver")
    public Driver getBusDriver () {
        return  new Driver("Иван", getBusBean());
    }

    @Bean (name = "pickupDriver")
    public Driver getPickupDriver () {
        return new Driver("Семен", getPickupBean());
    }
}
