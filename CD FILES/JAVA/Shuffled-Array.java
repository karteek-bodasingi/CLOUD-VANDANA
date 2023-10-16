import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Shuffle{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter array length");
        int n=s.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);
        list.toArray(arr);
        System.out.println("Shuffled Array: " + Arrays.toString(arr));
    }
}