package session30;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> citymap = new HashMap<>();
        citymap.put(100, "yazd");
        citymap.put(200, "tehran");
        citymap.put(100, "kerman");
        citymap.replace(200, "mashhad");
        System.out.println(citymap);
        System.out.println(citymap.keySet());
        System.out.println(citymap.values());
        System.out.println(".".repeat(20));
        System.out.println(""+citymap.get(100));
        //////////////////////////////////////

        for (Object o : citymap.keySet()) {
            System.out.println(o);
            System.out.println(citymap.get(o));
        }

        //------------------------------------------------------------------------
        System.out.println("|".repeat(20));
        for (int i=0;i<citymap.keySet().size();i++) {


        }
        System.out.println("|".repeat(20));
        //-------------------------------------------------------------------------

        System.out.println("-".repeat(20));
        for (Object o : citymap.entrySet()) {
            System.out.println(o);
        }


        ///////////////////////////////////////////////
        System.out.println("-".repeat(30));


        Map<String, List<String>> mymap = new HashMap<>();

        List<String>stringList=new LinkedList<>();

        stringList.add("yazd");
        stringList.add("shiraz");
        stringList.add("tehran");
        mymap.put("one",stringList);

        List<String>stringList1=new LinkedList<>();

        stringList1.add("kerman");
        stringList1.add("mashhad");
        stringList1.add("Esfahan");
        mymap.put("two",stringList1);

        System.out.println(mymap);


    }
}
