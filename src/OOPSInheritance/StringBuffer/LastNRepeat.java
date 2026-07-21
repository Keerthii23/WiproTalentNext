package OOPSInheritance.StringBuffer;

public class LastNRepeat {
    public static void main(String[] args) {
        String str = args[0];
        int n = Integer.parseInt(args[1]);

        String last = str.substring(str.length() - n);

        String result = "";
        for (int i = 0; i < n; i++) {
            result += last;
        }

        System.out.println(result);
    }
}