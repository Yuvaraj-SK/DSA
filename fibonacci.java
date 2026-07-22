import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for (int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        for (int a:arr
             ) {
            System.out.println(a);
        }
    }
}
