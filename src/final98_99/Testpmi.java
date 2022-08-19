package final98_99;

import java.util.HashMap;
import java.util.List;

public class Testpmi {
    public static void main(String[] args) {
        HashMap<String, String> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();

        hashMap1.put("Amini", "O+");
        hashMap1.put("Rezaee", "AB");
        hashMap1.put("Mohammadi","O+");
        hashMap1.put("Arjmand", "O-");
        hashMap1.put("Asadian", "A");

        hashMap2.put("Arjmand", "Shiraz");
        hashMap2.put("Asadian", "Kerman");
        hashMap2.put("Rezaee", "Tehran");
        hashMap2.put("Soheili", "Esfahan");
        hashMap2.put("Amini", "Yazd");
        hashMap2.put("jamshidi","tehran");

        UserPMI userPMI = new UserPMI();

        List list = userPMI.showUserInfo(hashMap1, hashMap2);
        for (Object o : list)
            System.out.println(o);


        for (String str: userPMI.getAllNames(hashMap1)
             ) {
            System.out.println(str);
        }
        for (String str:userPMI.bloodTypes(hashMap1)
             ) {
            System.out.println(str);
        }
    }
}
