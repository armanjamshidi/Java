package midterm99.TA;

public class Student {
    private String name;
    private String family;
    private int stdNumber;
    private double[] grads;
    private double avg;

    public Student(String name, String family, int stdNumber, double[] grads) {
        this.name = name;
        this.family = family;
        this.stdNumber = stdNumber;
        this.grads = grads;
        this.avg = Average();
    }

    public double Average() {
        double sum = 0;

        for (double grad : grads)
            sum += grad;

        return sum / (grads.length);
    }

    public String getName() {
        return name;
    }

    public int getStdNumber() {
        return stdNumber;
    }

    public double getAvg() {
        return avg;
    }

    @Override
    public String toString() {
        return "Name:" + this.name + " Family:" + this.family + " stdNo:" + this.stdNumber + " Average:" + this.avg + "\n";
    }

}
