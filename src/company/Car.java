package company;

import java.util.Objects;

public class Car  {

    private String name;

    private int cylinder;

    private boolean engine;

    private int wheels;

    public Car( String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }
 // getClass nesnenin tipini temsil eden class nesnesi döndürür
 // getSimpleName metodu ise bu class nesnesinin basit adını döndürüyor
    private void printSimpleName(){
        System.out.println("class name: " + getClass().getSimpleName());
    }

    public String startEngine(){
        printSimpleName();
        return "the car's engine is starting";
    }

    public String accelerate(){
        printSimpleName();
        return "the car is accelerating";
    }

    public String brake(){
        printSimpleName();
        return " the car is braking";
    }
// equals() metodunun amacı, iki nesnenin eşit olup olmadığını kontrol etmektir.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinder == car.cylinder && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinder=" + cylinder +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
