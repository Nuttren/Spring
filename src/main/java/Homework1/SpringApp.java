package Homework1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        car.start();
        Bus bus = context.getBean(Bus.class);
        bus.start();
        Pickup pickup = context.getBean(Pickup.class);
        pickup.start();

        Driver carDriver = context.getBean("carDriver", Driver.class);
        carDriver.startTheTransport();

        Driver busDriver = context.getBean("busDriver", Driver.class);
        busDriver.startTheTransport();

        Driver pickupDriver = context.getBean("pickupDriver", Driver.class);
        pickupDriver.startTheTransport();
    }
}
