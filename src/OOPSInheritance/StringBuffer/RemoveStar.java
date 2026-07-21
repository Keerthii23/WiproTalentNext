package OOPSInheritance.StringBuffer;

public class RemoveStar {
    public static void main(String[] args) {
        String str = args[0];
        int index = str.indexOf('*');

        String result = str.substring(0, index - 1)
                + str.substring(index + 2);

        System.out.println(result);
    }
}