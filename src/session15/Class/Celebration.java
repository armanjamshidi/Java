package session15.Class;

public class Celebration {
    private int n;
    private final Lamp[] lampArray;

    public Celebration(int n) {
        this.n = n;
        lampArray = new Lamp[n];
        for (int i = 0; i < n; i++)
            lampArray[i] = new Lamp();
    }

    public void showNumber(int m) {
        int pos = n - 1;
        for (int i = 0; i < n; i++) {
            lampArray[i].setStatus(false);
        }
        while (m != 0 && pos >= 0) {
            if (m % 2 != 0) {
                lampArray[pos].setStatus(true);
            }
            m /= 2;
            pos--;
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            if (lampArray[i].getStatus()) {
                System.out.print("*");
            } else {
                System.out.print("O");
            }
        }
        System.out.println();
    }

}
