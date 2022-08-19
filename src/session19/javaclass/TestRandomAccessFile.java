package session19.javaclass;

import java.io.IOException;

public class TestRandomAccessFile {

    public static void main(String args[]) throws IOException {

        ReadWriteRandomFile file = new ReadWriteRandomFile("c:\\temp\\acountss.dat");
        file.writeRecords();
        file.readRecords();
        file.closeFile();

    }

}
