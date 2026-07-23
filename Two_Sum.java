import java.util.Arrays;
import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,4,2,9,7,6,8,1};
        System.out.println("Sample array is :"+ Arrays.toString(arr));
        System.out.print("Enter the target value :");
        int target = sc.nextInt();

        for(int i =0;i<9;i++){
            for (int j=1;j<9;j++){
                int sum = arr[i]+arr[j];
                if (sum==target){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }

    }
}
