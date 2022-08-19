package session15.me;

import java.util.Arrays;

public class Celebration {
    private final int n;
    private final Lamp[] lampList;

    public Celebration(int n) {
        this.n = n;
        lampList = new Lamp[n];
        for (int i = 0; i < n; i++) {
            lampList[i] = new Lamp();
        }
    }

    public void ShowNumber(int m) {
        String[] array = convertBinary(m);

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("0")) {
                lampList[i].setStatus(false);
            }
            if (array[i].equals("1")) {
                lampList[i].setStatus(true);
            }
            System.out.println(i+":   "+lampList[i].isStatus());
        }

    }

    public String[] convertBinary(int num) {
        int[] binary = new int[n];
        int index = 0;
        String[] str = new String[n];
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = binary.length-1; i>=0 ; i--) {
            str[i] = String.valueOf(binary[i]);
        }
        return str;
    }

    public void print() {
        for (int i = lampList.length-1; i >=0 ; i--) {
            if (lampList[i].isStatus()) {
                System.out.print("*");
            } else {
                System.out.print("o");
            }
        }

    }


}

