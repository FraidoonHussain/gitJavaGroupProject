public class homeWork3 {
    /*
    Create a method that will print whether given String is palindrome or not.
     */
    homeWork3 palindrome (String reverse) {
        String reverse1= "";
        for (int i = reverse.length () -1; i >= 0; i --) {
            reverse1 =reverse1 + reverse.charAt(i);
        }
        if (reverse.equals(reverse1)) {
            System.out.println("given String is a palindrome");
        } else {
            System.out.println("given String is not a palindrome");
        }
        return null;
    }
    public static void main(String[] args) {
    }homeWork3 obj = new homeWork3();

    public homeWork3 getObj() {
        return obj.palindrome("ABC");
    }
}


