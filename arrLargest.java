import java.util.Arrays;

public class arrLargest {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        Arrays.sort(arr);
        System.out.println("Largest element in an array :"+arr[arr.length-1]);
    }
}
