package final98_99;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileArray {
    RandomAccessFile file;
    int row;
    int col;

    public FileArray(String filename, int row, int col) throws IOException {
        this.file = new RandomAccessFile(filename, "rw");
        this.row = row;
        this.col = col;
//        makeNewFile();
    }

    private void makeNewFile() throws IOException {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                file.writeDouble(-1);
            }
        }
    }

    public void setMember(int row, int col, double val) throws IOException {

        file.seek(row * (this.col * 8L) + col * 8L);

        file.writeDouble(val);
    }

    public double getMember(int row, int col) throws IOException {

        file.seek(row * (this.col * 8L) + col * 8L);
        System.out.println(file.getFilePointer());
        return file.readDouble();

    }

    public double[] getRow(int row) throws IOException {
        double[] arr = new double[this.col];
        for (int i = 0; i < col; i++) {
            file.seek(row * (this.col * 8L) + i * 8L);
            System.out.println("pointer :" + file.getFilePointer());
            arr[i] = file.readDouble();
        }
        return arr;
    }

    public double[] getCol(int col) throws IOException {
        double[] arr = new double[this.row];
        for (int i = 0; i < row; i++) {
            file.seek(i* (this.col * 8L) + col * 8L);
            arr[i] = file.readDouble();
        }
        return arr;
    }

}
