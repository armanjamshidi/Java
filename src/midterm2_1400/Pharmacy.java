package midterm2_1400;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Pharmacy {

    private Prescription prescription;
    private RandomAccessFile file;
    private final String path = "Pharmacy.dat";

    public Pharmacy() throws FileNotFoundException {
        prescription = new Prescription();
        file = new RandomAccessFile(path, "rw");
    }

    public void createPrescriptions(int n) throws IOException {
        for (int i = 1; i <= n; i++) {
            prescription.createPrescription(i);
            prescription.writePrescriptionInFile(file);
        }
    }

    public void findPrescriptions(String doctorCode) throws IOException {
        file.seek(0);
        for (int i = 0; i < file.length() / 208; i++) {
            file.seek(i * 208L);
            prescription.readPrescriptionFromFile(file);
            if (doctorCode.equals(prescription.getDoctorCode())) {
                System.out.println(prescription);
            }
        }

    }
}
