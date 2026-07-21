package OOPSInheritance.StringBuilder;

public class AlternateCombine {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];

        String result = "";
        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        if (a.length() > b.length())
            result += a.substring(min);
        else
            result += b.substring(min);

        System.out.println(result);
    }
}