package OOPSInheritance.StringBuffer;
public class Stringconcat {
    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];
        String result;

        if (Character.toLowerCase(s1.charAt(s1.length() - 1)) ==
            Character.toLowerCase(s2.charAt(0))) {
            result = s1 + s2.substring(1);
        } else {
            result = s1 + s2;
        }

        System.out.println(result.toLowerCase());
    }
}