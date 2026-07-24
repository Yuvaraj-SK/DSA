import java.util.Arrays;

public class arrReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6}; //input1
        //int[] arr = {1,2,3,4,5}; //input2
        int n = arr.length;
        for (int i = 0; i < n-(i+1); i++) {
            int temp = arr[i];
            arr[i] = arr[n-(i+1)];
            arr[n-(i+1)] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
