package session27;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {

        // default 10, 1_000_000
        //20,40,40,80,160,320,640,....

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("Data Structure");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        arrayList.clear();
        System.out.println(arrayList);

        arrayList = toLowercase(arrayList);
        int arrayint[];
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(12);
        arrayList2.add(13);
        arrayList2.add(14);
        System.out.println(arrayList2);
        System.out.println("size=" + arrayList2.size());
        arrayList2.add(1, 18);
        System.out.println(arrayList2);
        arrayList2.set(1, 20);
        System.out.println(arrayList2);
//        ArrayList<Course> arrayList3 = new ArrayList<>();

//          for(String val:arrayList){
//              System.out.println(val);
//              
//        }
    }

    public static ArrayList<String> toLowercase(List<String> array) {

        ArrayList<String> arrayNew = new ArrayList<>();
        for (String val : array) {
            arrayNew.add(val.toLowerCase());

        }

        return arrayNew;

    }

}
