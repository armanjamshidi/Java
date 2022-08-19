package session29;

import java.util.HashMap;
import java.util.Map;


public class TestHashMap {
    //123 Ali Zakeri....     
    //124 ....
    
    public static void main(String args[]) {
            
        //(123,"Ali Zakeri")  (124,"Reza Rezaee")  (125,"Javad Zareh")
        //(126,"Ali Zakeri")
        Map<Integer,String> hm=new HashMap<>(); //(key, value)
        hm.put(123, "Ali Zakeri");
        hm.put(124, "Reza Rezaee");
        hm.put(123, "Javad Zareh");
        hm.put(124, "Reza Zakeri");
        hm.put(12332,"arman");
        hm.put(1452,"eliot");
        System.out.println(hm.get(124));
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.remove(123,"Javad Zareh"));
        System.out.println(hm);
        System.out.println(hm.containsKey(124));
        System.out.println(hm.containsValue("arman"));
        System.out.println(hm.entrySet());
        
        
        
            
            
            
            
            
            
            
            
            
        }
    
    
    
}
