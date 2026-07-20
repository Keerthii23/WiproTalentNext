package OOPSInheritance.StringJoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class JoinNames {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Keerthi");
        names.add("Rahul");
        names.add("Priya");
        names.add("Kiran");

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}