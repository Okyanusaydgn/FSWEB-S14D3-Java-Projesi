package arge;

public class ElectricCar extends CarSkeleton{

    private double avgKmPerCharge;

    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterSize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterSize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterSize(int batterSize) {
        this.batterySize = batterSize;
    }

    @Override
    public String startEngine() {
        runEngine(this); // burada electricCar sınıfnda this yazınca carSkeleton ı aldı çünkü extend ettik.
        return getName() + " car starting...";
    }

    @Override
    public String drive() {
        runEngine(this);
        return " run from electric car! ";
    }
}
