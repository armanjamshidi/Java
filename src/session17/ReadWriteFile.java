package session17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

//Sequential Access File
//فایل با دسترسی ترتیبی
public class ReadWriteFile {

    private Formatter output;
    private String fileName;

    public ReadWriteFile(String fileName) {
        this.fileName = fileName;
    }

    public void createFile() throws FileNotFoundException {
        output = new Formatter(fileName);
    }

    //AccountNo  Name Family  Balance
    //123        Reza Rezaee  1000.0
    public void addRecords() {
        int ac = 123;
        String name = "Reza";
        String family = "Rezaee";
        double bl = 1000.0;
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter Account No:");
//        ac=input.nextInt();
//        System.out.println("Enter Name:");
//        name=input.next();
//        System.out.println("Enter Family:");
//        family=input.next();
//        System.out.println("Enter Balance:");
//        bl=input.nextDouble();

        output.format("%5d %15s %15s %f\n", ac, name, family, bl);
        output.format("%5d %15s %15s %f\n", 124, "Ali", "Zakeri", 2000.0);

    }

    public void closeFile() {
        output.close();

    }

    public void readRecords() throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        while (input.hasNext()) {
            System.out.printf("%d %s %s %f\n", input.nextInt(),input.next(), input.next(), input.nextDouble());
        }
    }

    public void searchAccount(double gte) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        int ac;
        String name;
        String family;
        double bl;

        while (input.hasNext()) {
            ac = input.nextInt();
            name = input.next();
            family = input.next();
            bl = input.nextDouble();
            if (bl >= gte) {
                System.out.printf("%d %s %s %f\n", ac, name, family, bl);
            }

        }

    }

}
