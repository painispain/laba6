package Tasks.T1;
import Tasks.Students;
import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class TestIs
{
    public static void main(String[] args)
    {
        List<Students> students = new ArrayList<>();
        Comparator CompareID=new ID();
        Students Student1 = new Students(7, "Иванов",4.1);
        Students Student2 = new Students(3, "Петров",4.4);
        Students Student3 =new Students(1, "Андреев", 5);
        Students Student4 = new Students(5, "Глазецкая",3.7);
        Students Student5 = new Students(9, "Вельмисова", 4.8);
        students.add(Student1);
        students.add(Student2);
        students.add(Student3);
        students.add(Student4);
        students.add(Student5);
        Insertionsort.insertionSort(students, CompareID);
        System.out.println("\n\t\t  Сортировка вставкми по ID:");
        for (Students s: students)
        {
            System.out.println(s);
        }
    }
}