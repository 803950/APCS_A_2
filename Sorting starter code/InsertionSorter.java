
/**
 * Write a description of class InsertionSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertionSorter extends Sorter
{
    public InsertionSorter() {
        super();
    }
    public void sort(int[] a) { 
        for (int  i = 0; i < a.length; i++) 
        {
            int mi = i; // maximum index
            for(int  j = i ; j > 0 ; j--)
            {
                if(!less(a[j],a[j-1])){
                    mi = j;
                }
            }
            swap(a, i, mi);
        }
    }
}
