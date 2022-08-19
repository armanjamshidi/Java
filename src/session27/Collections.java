package session27;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("arman");
        arrayList.add("negin");
        arrayList.add("reza");

        arrayList.forEach(System.out::println);

    }
}
