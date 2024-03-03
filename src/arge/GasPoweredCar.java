package arge;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLiter;

    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting... ";
    }

    @Override
    public String drive() {
        runEngine(this);
        return " run from gas powered car ";
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public void setAvgKmPerLiter(double avgKmPerLiter) {
        this.avgKmPerLiter = avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }


}
