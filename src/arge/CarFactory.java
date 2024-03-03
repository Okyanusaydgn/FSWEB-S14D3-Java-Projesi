package arge;
// main class ı kullanmak yerine "public static void main(String[] args) {}" bu kodu yazmak yeterlidir.
public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("Tesla","Electrical Car",100,4);
        CarSkeleton hybridCar = new HybridCar("toyota","hybrid car",0.8,100,4);
        CarSkeleton gasCar = new GasPoweredCar("bmw","gas car",15,4);
        printDriveResult(electricCar);
        printDriveResult(hybridCar);
        printDriveResult(gasCar);
    }

    private  static void  printDriveResult(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.drive());
    }
}
