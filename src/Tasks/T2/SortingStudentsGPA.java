package Tasks.T2;
import java.lang.*;
import Tasks.Students;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class SortingStudentsGPA
{
    public static void GPASort(List<Students> list, Comparator c)
    {
        quickSort(list, 0, list.size() - 1, c);
    }

    public static void quickSort(List<Students> list, int left, int right, Comparator c)
    {
        int l = left;
        int r = right;
        Students temp = list.get((l + r)/2);
        do
        {
            while (c.compare(list.get(l), temp)<0)
            {
                l++;
            }
            while (c.compare(list.get(r),temp)>0)
            {
                r--;
            }
            if (l <= r)
            {
                if (l < r)
                {
                    Collections.swap(list, l, r);
                }
                l++;
                r--;
            }
        } while (l <= r);
        if (l < right)
        {
            quickSort(list, l, right, c);
        }
        if (left < r)
        {
            quickSort(list, left, r, c);
        }
    }
}
class CompareGPA implements Comparator<Students>
{
    @Override
    public int compare(Students o1, Students o2)
    {
        return Double.compare(o2.getGrade(), o1.getGrade());
    }
}