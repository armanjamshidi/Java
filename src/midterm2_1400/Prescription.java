package midterm2_1400;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Prescription {
    private final Code code;
    private String prescriptionCode;
    private String doctorCode;
    private String patientCode;
    private Medicine[] medicine ;
    private final int fixLen = 20;

    public Prescription() {
        this.code = new Code();
        this.medicine = new Medicine[2];
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void createPrescription(int i) {

        this.prescriptionCode = code.prescriptionCode(i);
        this.doctorCode = code.doctorCode(i);
        this.patientCode = code.patientCode(i);
        this.medicine[0] = new Medicine(i, code);
        this.medicine[1] = new Medicine(i, code);
//        for (Medicine medicine : this.medicine) {
//            medicine = new Medicine(i, this.code);
//        }
    }

    public void writePrescriptionInFile(RandomAccessFile file) throws IOException {

        file.seek(file.length());

        file.writeChars(fixStringLength(prescriptionCode));
        file.writeChars(fixStringLength(doctorCode));
        file.writeChars(fixStringLength(patientCode));
        for (int i = 0; i < 2; i++) {
            file.writeChars(fixStringLength(medicine[i].getMedicineCode()));
            file.writeInt(medicine[i].getPrice());
        }
    }

    public void readPrescriptionFromFile(RandomAccessFile file) throws IOException {
        this.prescriptionCode = readString(file);
        this.doctorCode = readString(file);
        this.patientCode = readString(file);
        for (int i = 0; i < 2; i++) {
            this.medicine[i]=new Medicine();
        }
        for (int i = 0; i < 2; i++) {
            this.medicine[i].setMedicineCode(readString(file));
            this.medicine[i].setPrice(file.readInt());
        }
    }

    public String fixStringLength(String str) {

        if (str.length() >= 20) {
            return str.substring(0, 20);
        } else {
            int spaceNo = 20 - str.length();
            for (int i = 0; i < spaceNo; i++) {
                str += " ";
            }
            return str;
        }
    }

    public String readString(RandomAccessFile file) throws IOException {
        String str = "";
        for (int i = 0; i < 20; i++) {
            str += file.readChar();
        }
        return str.trim();
    }

    @Override
    public String toString() {
        return "Prescription{" +
                ", prescriptionCode='" + prescriptionCode + '\'' +
                ", doctorCode='" + doctorCode + '\'' +
                ", patientCode='" + patientCode + '\'' +
                ", medicine=" + Arrays.toString(medicine) +
                '}';
    }
}
