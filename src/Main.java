// Polymorphism çok biçimlilik anlamına gelir ve java polymorphism üzerine kurulmuştur.
// Kısaca Runtime anına objelerin davranış şekillerini değiştirme diyebiliriz.
//  Farklı nesnelerin aynı methodu çağrımasına izin veren özellik
// Aynı methodun farklı şekillerde uygulanması diyebiliriz.
// override etmek : Bu, alt sınıfın üst sınıftan aldığı bir metodu veya yöntemi kendi ihtiyaçlarına göre değiştirebileceği anlamına gelir.
//Loglamak" terimi, genellikle bir uygulamanın çalışması sırasında belirli bilgileri kaydetmek veya raporlamak anlamına gelir. Loglar, bir uygulamanın durumunu izlemek, hata ayıklama yapmak veya performans sorunlarını belirlemek için kullanılır.
import company.Mitsubishi;
import company.Car;
import company.Ford;
import company.Holden;
public class Main {
    public static void main(String[] args) {


        Car car = new Car("Base car",8);
      // biz aşağıdaki kodları kullanmamak için aşağıda bir kod yazıyoruz ve burada kullanıyoruz.
        //   System.out.println(car.startEngine());
        //System.out.println(car.accelerate());
        //System.out.println(car.brake());
        testPoly(car);

        Car mitsubishi = new Mitsubishi("Outlander VRX 4WD",6);
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
        testPoly(mitsubishi);

        Car ford = new Ford("Ford Falcon",6);
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());
        testPoly(ford);

        Car holden = new Holden( "Holden Commodore",6);
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate());
//        System.out.println(holden.brake());
        testPoly(holden);
    }
    // car class ı holden class ın parent ı  holden class ı car classının herhangi bir methodunu
    // override ettiyse, car classının herhangi bir override methodunu çağırdığımızda holden' ın  methodunu çalıştırır

    private static void testPoly(Car car){
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
}