package session21;

import java.io.FileNotFoundException;
import java.io.IOException;


public class TestRandomAccessFile {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        ReadWriteRandomFile file = new ReadWriteRandomFile("c:\\temp\\acounts.dat");
        file.writeRecords();

        int acNo=1;
        file.readRecords(acNo*92);
        file.closeFile();

    }

}
