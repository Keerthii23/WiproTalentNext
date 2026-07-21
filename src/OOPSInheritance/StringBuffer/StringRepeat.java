package OOPSInheritance.StringBuffer;
public class StringRepeat {
    public static void main(String[] args) {
        String str = args[0];
        String firstTwo = str.substring(0, 2);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += firstTwo;
        }

        System.out.println(result);
    }
}
