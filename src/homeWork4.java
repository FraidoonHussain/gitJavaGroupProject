
public class homeWork4 {
/*
Create a method tht will say Hello in different languages based on the country that will
passed when method is executed.
 */
    void sayHello(String country) {
        if (country.equalsIgnoreCase("Afghanistan")) {
            System.out.println("Assalaam Alykum");
        } else if (country.equalsIgnoreCase("USA")) {
            System.out.println("Hello");
        } else if (country.equalsIgnoreCase("Spain")) {
            System.out.println("Hola");
        }
    }



    public static void main(String[] args) {
        homeWork4 greet=new homeWork4();
        greet.sayHello("Afghanistan");
        greet.sayHello("USA");
        greet.sayHello("Spain");





    }


}
