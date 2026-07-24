import java.util.Arrays;

public class arrSmallest {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        Arrays.sort(arr);
        System.out.println("Smallest element in an array :"+arr[0]);
    }
}
