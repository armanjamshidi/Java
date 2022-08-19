package session22.me;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestR {
    static public void main(String[] args) throws IOException {
        String path = "C:\\temp\\test.dat";
        RandomAccessFile file = new RandomAccessFile(path, "rw");
        file.writeInt(123);
        file.writeChars("java programming");
        file.writeDouble(17.0);
        file.seek(0);
        System.out.println(file.readInt());
        String str = "";
        for (int i = 0; i < 16; i++) {
            str += file.readChar();
        }
        System.out.println(str);
        System.out.println(file.readDouble());
        file.close();

    }
}
