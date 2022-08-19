package session21;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


//فایل با دسترسی تصادفی
public class ReadWriteRandomFile {

    private RandomAccessFile file;
    private final int STRINGLEN = 20;

    public ReadWriteRandomFile(String fileName) throws FileNotFoundException {
        file = new RandomAccessFile(fileName, "rw"); //mode=read   write  read/write
    }

    //123 4 Reza 6 Rezaee 1000.0 
    //acNo=4byte  Name=20 character Family=20 character  Balance=8 byte
    //4+40+40+8=92bytes
    //0 Reza Rezaee ...
    //1 Ali ...
    //2 ...
    public void writeRecords() throws IOException {
        int ac = 123;
        String name = "Reza";
        String family = "Rezaee";
        double bl = 1000.0;
        //123124
        file.writeInt(ac);
        file.writeChars(fixStringLength(name, 20));
        file.writeChars(fixStringLength(family, 20));
        file.writeDouble(bl);

        file.writeInt(124);
        file.writeChars(fixStringLength("Ali", STRINGLEN));
        file.writeChars(fixStringLength("Zakeri", STRINGLEN));
        file.writeDouble(20000.0);

    }

    public String fixStringLength(String str, int len) {

        if (str.length() >= len) {
            return str.substring(0, len);
        } else {
            int spaceNo = len - str.length();
            for (int i = 0; i < spaceNo; i++) {
                str += " ";
            }
            return str;
        }

    }

    public void readRecords(long position) throws IOException {
        int ac;
        String name = "";
        String family = "";
        double bl;

        file.seek(position);  //seek(n) jump to position n(byte nth)  
        ac = file.readInt();
        System.out.println("ac=" + ac);

        name = readString(STRINGLEN);
        System.out.println("name=" + name);
        family = readString(STRINGLEN);

        System.out.println("family=" + family);
        bl = file.readDouble();
        System.out.println("balance=" + bl);

    }

    public String readString(int len) throws IOException {
        String str = "";

        for (int i = 0; i < len; i++) {
            str += file.readChar();
        }
        return str.trim();
    }

    public void closeFile() throws IOException {
        file.close();
    }

}
