package AccessModifiersHwClass16;

public class HomeWork3 {
    /*Create a method that will accept a String as a parameter and return a new String that consist
    only of vowels.
    Method should be available inside the class only where it was declared an executed by calling it is name.
     */
private String vowels (String str) {
    char c = 0;
    for (int i =0; i< str.length(); i++) {
    c = str.charAt(i);
    if (c == 'a' || c == 'e' || c== 'i' || c =='o' || c == 'u') {
        System.out.println(c);
    }

 }
    return str;
}
    public static void main(String[] args) {
        HomeWork3 obj = new HomeWork3();
        System.out.println(obj.vowels("Hi everyone at Syntax"));
    }
}


