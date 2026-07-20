package StringBuilder;
public class StringPalindrome {
    public static void main(String[] args) {
        String str = args[0];
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
