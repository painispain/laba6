package Tasks;
import java.lang.*;

public class Students
{
    int iDNumber;
    String name;
    double grade;

    public Students(int iDNumber, String name, double grade) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.grade = grade;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "ID: " + this.iDNumber + "\t Name: " + this.name + "\t\tAverage grade: " + this.grade;
    }
}
