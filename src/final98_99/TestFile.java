package final98_99;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class TestFile {
    public static void main(String[] args) throws IOException {

        FileArray fileArray = new FileArray("d:\\Arman.txt", 4, 4);
//        System.out.println(fileArray.getMember(1, 0));
//        System.out.println(Arrays.toString(fileArray.getRow(0)));
        fileArray.setMember(0, 0, 0);

        fileArray.setMember(0, 1, 1);


        fileArray.setMember(0, 2, 2);
        fileArray.setMember(0, 3, 3);
        System.out.println(Arrays.toString(fileArray.getRow(0)));
        fileArray.setMember(1, 0, 4);
        fileArray.setMember(1,1,12);
        fileArray.setMember(1,2,32);
        fileArray.setMember(1,3,42);
        System.out.println(Arrays.toString(fileArray.getRow(1)));
        fileArray.setMember(2, 0, 5);
        fileArray.setMember(2,1,123);
        System.out.println(fileArray.getMember(2,1));
        fileArray.setMember(3, 0, 6);
        System.out.println(Arrays.toString(fileArray.getCol(0)));











    }
}
