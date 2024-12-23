import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the d value:");
        int d = sc.nextInt();
        Rightrotate(arr,n,d);

        System.out.println("After right rotating the array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Rightrotate(int[] arr, int n, int d) {
        if ( n== 0) {
            return;
        }

        d = d%n;
        if ( d> n) {
            return;
        }

        int[] temp = new int[d];
        for(int i = n-d; i <n; i++) {
            temp[i-(n-d)] = arr[i];
        }

        for(int i = n-d-1; i>=0; i--) {
            arr[i+d] = arr[i];
        }

        for(int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }
}