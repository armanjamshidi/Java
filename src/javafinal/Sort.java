package javafinal;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public void sort(ArrayList<String> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).compareTo(array.get(j)) > 0) {
                    String str = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, array.get(i));
                    array.set(i, str);
                }
            }
        }
        System.out.println(array);
    }
}
