package session19.javaclass;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


//فایل با دسترسی تصادفی
public class ReadWriteRandomFile {

    private RandomAccessFile file;

    public ReadWriteRandomFile(String fileName) throws FileNotFoundException {
        file = new RandomAccessFile(fileName, "rw"); //mode=read   write  read/write
    }

    //123Reza@Rezaee@1000.0
    public void writeRecords() throws IOException {
        int ac = 123;
        String name = "Reza";
        String family = "Rezaee";
        double bl = 1000.0;
        //123124
        file.writeInt(ac);
        file.writeChars(name);
        file.writeChars(family);
        file.writeDouble(bl);
     file.seek(0);//برای جلسه درس داده شده نیست
    }
    public void readRecords() throws IOException{
        int ac;
        String name="";
        String family="";
        double bl;
        
        ac=file.readInt();
        System.out.println("ac="+ac);
        
        for (int i = 0; i < 4; i++) {
            name+=file.readChar();
            
        }
        System.out.println("name="+name);
        for (int i = 0; i < 6; i++) {
            family+=file.readChar();
            
        }
        System.out.println("family="+family);

        bl=file.readDouble();
        System.out.println("balance="+bl);
        
        
        
    }
    
    
    public void closeFile() throws IOException{
        
        file.close();
    }

}
