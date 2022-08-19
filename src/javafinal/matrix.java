package javafinal;

import java.io.IOException;
import java.io.RandomAccessFile;

public class matrix {


    public matrix() {
    }

    public void writeMatrix(RandomAccessFile file,int [][]array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                file.writeInt(array[i][j]);
            }
        }
    }
//public int [][] readMatrix(RandomAccessFile file) throws IOException {
//    int [][]array ;
//        for (int i = 0; i < file.length(); i++) {
//            for (int j = 0; j < file; j++) {
//
//            }
//    }
//
//}
}
