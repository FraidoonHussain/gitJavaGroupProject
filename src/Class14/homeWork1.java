package Class14;

public class homeWork1 {
    /*
    Create a method that will take 2 parameters as a number and prints which number is larger.
     */
    Void num (int num1, int num2) {

        if (num1 < num2) {
            System.out.println(num2 + " is greater");

        } else {
            System.out.println(num1 + "is greater");
        }
        return null;
    }

    public static void main(String[] args) {
        homeWork1 obj = new homeWork1();
        obj.num(234567,6678990);
    }

}
