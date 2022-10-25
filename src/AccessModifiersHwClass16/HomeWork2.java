package AccessModifiersHwClass16;

public class HomeWork2 {





    public String reverse (String s) {
        String rev ="";
        for (int i=s.length()-1; i>=0; i--) {
            rev +=s.charAt(i);
        }
    return rev;
    }

    public static void main(String[] args) {
        HomeWork2 strRev = new HomeWork2();
        System.out.println(strRev.reverse("java"));
    }
}
