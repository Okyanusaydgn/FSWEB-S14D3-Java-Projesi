package company;

public class Mitsubishi extends Car {

    public Mitsubishi(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + "engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + " is accelarating";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() + "is braking! ";
    }
}
