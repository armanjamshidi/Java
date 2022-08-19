package final98_99;

import java.util.*;


public class UserPMI {
    List<String> list1 = new LinkedList<>();

    String str;

    public UserPMI() {
    }

    public List<String> showUserInfo(HashMap<String, String> hashMap1, HashMap<String, String>
            hashMap2) {
        for (String str1 : hashMap1.keySet()) {
            for (String str2 : hashMap2.keySet()) {
                str = str1 + " : " + hashMap1.get(str1) + " : " + "unknown";
                if (str1.equals(str2)) {
                    str = str1 + " : " + hashMap1.get(str1) + " : " + hashMap2.get(str1);
                    break;
                }
            }
            list1.add(str);
        }

        for (String str3 : hashMap2.keySet()) {

            if (!list1.contains(str3 + " : " + hashMap1.get(str3) + " : " + hashMap2.get(str3))) {
                list1.add(str3 + " : " + "unknown" + " : " + hashMap2.get(str3));

            }

        }
        return list1;
    }

    public List<String> getAllNames(Map<String, String> hashMap1) {

        return new ArrayList<>(hashMap1.keySet());
    }

    Set<String> bloodTypes(Map<String, String> hashMap1) {

        return new HashSet<>(hashMap1.values());
    }
}
