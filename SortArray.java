package PST;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1};

        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));

        System.out.print("Descending: ");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}


