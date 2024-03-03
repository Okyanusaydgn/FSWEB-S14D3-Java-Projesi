package arge;

import company.Car;

public class CarSkeleton {
    private String name;

    private String description;

    public CarSkeleton(){

    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine(){
        System.out.println("Class name: " + getClass().getSimpleName());
        return getName() + " is starting engine";
    }

    public String drive(){
        runEngine(this);
        return getName() + "is driving";
    }

    public void runEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.getClass().getSimpleName());
        //  instanceof operatörü bir nesnenin belirli bir türden olup olmadığını. Yani nesnenin bir sınıfın örneği olup olmadığını veya bir sınıfın alt sınıfından türetilmiş olup olmadığını kontrol ediyor.
        // aşağıda parentobjenin electricCar olup olmadığına bakacağız.
        if(carSkeleton instanceof ElectricCar){
           double kmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
           // Downcasting, bir üst sınıftan (genel türden) daha özel bir alt sınıfa (daha özelleştirilmiş bir türe) dönüştürme işlemidir.Bu şekilde, nesnenin ElectricCar sınıfından olup olmadığı kontrol edilir ve downcasting işlemi güvenli bir şekilde gerçekleştirilir.
          int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
          System.out.println("The car engine is starting with electric. Per charge: " + kmPerCharge + "battery size: " + batterySize);
        } else if (carSkeleton instanceof HybridCar) {
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("The car engine is starting with electric. Per charge: " + hybridCar.getAvgKmPerLiter() + "battery size: " + hybridCar.getBatterySize() + " cylinders: " + hybridCar.getCylinders());
            
        } else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.println("The car engine is starting with electric. Per charge: " + gasPoweredCar.getAvgKmPerLiter());
        } else {
            System.out.println(" invalid car type");
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}
