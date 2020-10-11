package Tasks.T1;
import Tasks.Students;
import java.lang.*;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Insertionsort
{
    public static void insertionSort(List<Students> list, Comparator c)
    {
        for (int i = 1; i < list.size()-1; i++)
        {
            Students temp = list.get(i);
            int j = i-1;
            while (j >-1 && c.compare(list.get(j),temp)>0)
            {
                Collections.swap(list,j+1, j);
                j--;
            }
        }
    }
}
class ID implements Comparator<Students>
{
    @Override
    public int compare(Students o1, Students o2)
    {
        return o1.getiDNumber() - o2.getiDNumber();
    }
}