package session19.me;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {


    static public void main(String[] args) throws IOException {
        ReadWriteRandomFile file = new ReadWriteRandomFile("c:\\temp\\accounts.dat");

       // file.WriteRecords();
        file.readRecords();
        file.closeFile();


    }
}
