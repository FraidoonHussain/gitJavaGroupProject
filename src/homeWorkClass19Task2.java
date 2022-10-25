public class homeWorkClass19Task2 {
/*
Write program to inherit class A that has method printF which is static and call or reuse that method into class B
 */

class A {

    static void printF () {
        System.out.println("Its coming from class A");

    }
}
class B extends A{
    public static void main(String[] args) {

    }
}
