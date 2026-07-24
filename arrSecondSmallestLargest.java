import java.util.Arrays;
import java.util.LinkedHashSet;

public class arrSecondSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        Arrays.sort(arr);

        for (int i=1;i<arr.length-1;i++){
            if (arr[i]>arr[0]){
                System.out.println("Second Smallest :"+arr[i]);
                break;
            }
        }

        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]<arr[arr.length-1]){
                System.out.println("Second Largest :"+arr[i]);
                break;
            }
        }
    }
}
