package session17;

import java.io.FileNotFoundException;

public class TestReadWriteFile {

    public static void main(String[] args) throws FileNotFoundException {
        ReadWriteFile file = new ReadWriteFile("account.txt");
        file.createFile();
        file.addRecords();
        file.closeFile();
        file.readRecords();
        file.searchAccount(1500);

    }

}
