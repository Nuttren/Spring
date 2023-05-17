package Homework1;

public abstract class Transport {
    private String Brand;
    private String Model;
    private double engineSize;

    public Transport(String brand, String model, double engineSize) {
        Brand = brand;
        Model = model;
        this.engineSize = engineSize;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", engineSize=" + engineSize +
                '}';
    }
}
