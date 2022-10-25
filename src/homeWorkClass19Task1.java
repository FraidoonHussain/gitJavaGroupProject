public class homeWorkClass19Task1 {
/*Write program for multilevel inheritance where class C inherits 
from class B and Class B inherits from Class A.
 */
public static void main(String[] args) {
    Bugatti obj = new Bugatti();
    obj.vehicleType();
    obj.brand();
    obj.topspeed();
    
    class Car {
        public void vehicleType ()
        System.out.println("Vehicle Type: Car");
    }
}class Chiron Sport extends Car{
    public void brand () {
        System.out.println("Brand: Chiron Sport");
    }
}
class Bugatti extends Chiron Sport {
    public Chiron Sport {
        System.out.println("Model Name: Bugatti");
    }
    public void topspeed() {
        System.out.println("Max: 200mph");
    }
    public void vehicleType() {
    }
}





