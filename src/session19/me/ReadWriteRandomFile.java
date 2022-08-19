package session19.me;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class ReadWriteRandomFile {
    private final RandomAccessFile file;

    public ReadWriteRandomFile(String filename) throws FileNotFoundException {
       file=new RandomAccessFile(filename,"rw");

    }
    public void WriteRecords() throws IOException {
        int ac=123_234_245_4;
        String name="arman";
        String family="jamshidi";
        double bl=1000.0;

        file.writeInt(ac);
        file.writeChars(name);
        file.writeChars(family);
        file.writeDouble(bl);


    }
    public void closeFile()throws IOException
    {
        file.close();
    }
    public void readRecords() throws IOException {
        int ac;
        ac=file.readInt();
        System.out.printf("ac=%d\n",ac);
//String name = "";
//        for (int i = 0; i <5; i++) {
//            name+=String.valueOf(file.readChar());
//        }
        String family = "";
       String fam = "";

//        for (int i = 0; i < 8; i++) {
//            family+=String.valueOf(file.readChar());
//        }
//        System.out.println(name);
        System.out.println(fam);
    }

}
