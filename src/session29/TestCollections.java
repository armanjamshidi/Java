package session29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class TestCollections {

    public static void main(String args[]) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("C++");
        arrayList.add("OS");
        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("java");
        linkedList.add("C++");
        linkedList.add("Java");

        System.out.println("linked list:");
        System.out.println(linkedList);
        System.out.println("size=" + linkedList.size());
        toLowercase(linkedList);

        HashSet<String> hs = new HashSet<>();
        hs.add("java");
        hs.add("C++");
        hs.add("java");
        System.out.println("Hashset:");
        System.out.println(hs);
        System.out.println(hs.size());


    }

    public static ArrayList<String> toLowercase(List<String> array) {

        ArrayList<String> arrayNew = new ArrayList<>();
        for (String val : array) {
            arrayNew.add(val.toLowerCase());
        }
        return arrayNew;

    }

}
