package Tasks.T3;
import Tasks.Students;
import java.util.Comparator;
import java.util.List;

public class Merge_Sorting
{
    public static Students[] MergeSorting(List<Students> first, List<Students> second, Students[] result, Comparator c)
    {
        Students[] list1 = first.toArray(new Students[first.size()]);
        Students[] list2 = second.toArray(new Students[second.size()]);
        System.arraycopy(Merge_Sort(MergeList(result, list1, list2, first.size(),second.size(), c),result.length, c), 0, result, 0, result.length);
        return Merge_Sort(MergeList(result, list1, list2, first.size(), second.size(), c),result.length, c);
    }

    public static Students[] Merge_Sort(Students[] a, int n, Comparator c) {
        if (n < 2)
        {
            return a;
        }
        int mid = n / 2;
        Students[] l = new Students[mid];
        Students[] r = new Students[n - mid];
        for (int i = 0; i < mid; i++)
        {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++)
        {
            r[i - mid] = a[i];
        }
        Merge_Sort(l, mid, c);
        Merge_Sort(r, n - mid, c);
        MergeList(a, l, r, mid, n - mid, c);
        return a;
    }

    static Students[] MergeList(Students[] mas,Students[] first, Students[] second, int n, int m, Comparator c)
    {
        int i = 0, f = 0, s = 0;
        while (f < n && s < m) {
            if (c.compare(first[f], second[s])<0)
                mas[i++] = first[f++];
            else
                mas[i++] = second[s++];
        }
        while (f < n)
            mas[i++] = first[f++];
        while (s < m)
        {
            mas[i++] = second[s++];
        }
        return mas;
    }
}

class Compare implements Comparator<Students>
{
    @Override
    public int compare(Students o1, Students o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}