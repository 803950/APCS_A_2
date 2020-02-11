import java.util.*;
public class Shuffle{
    public Shuffle(){
    }
    
    public static int[] shuffle(int[] arr){
        int ri;
        int num;
        ArrayList<Integer> randarr = new ArrayList<Integer>();
        for(int i = 0 ; i <52; i++){
            randarr.add(i);
        }
        int[] newarr = new int[52];
        Random r = new Random();
        for(int i = 0; i<52; i++){
            num = r.nextInt(randarr.size());
            ri = randarr.get(num);
            randarr.remove(num);
            newarr[i] = arr[ri];
        }
        return newarr;
    }
    
    public static void arrToString(int[] arr){
        System.out.print("[");
        for(int i = 0; i<arr.length - 1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]+ "]");
    }
    
    public static void main(){
        int[] a = new int[52];
        for(int i = 0; i <a.length; i++){
             a[i] = i+1;   
        }
        System.out.println("Initial array: ");
        arrToString(a);
        a = shuffle(a);
        System.out.println("Shuffled array: ");
        arrToString(a);
    }
}