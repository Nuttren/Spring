package Homework1;

public class Driver {
    private String Name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        Name = name;
        this.transport = transport;
    }

    public void startTheTransport() {
        System.out.println(Name + " сел(а) в " + transport.getBrand());
    }
}
