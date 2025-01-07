/*Problem Statement: Given an array of integers, rotating array of elements by k elements to left.*/
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the d value:");
        int d= sc.nextInt();

        LeftRotate(arr,n,d);

        System.out.println("After left rotating the array by d places:");
        for(int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void LeftRotate(int[] arr, int n, int d) {
        if ( n== 0) {
            return;
        }

        d = d % n;
        if (d > n) {
            return;
        }

        int[] temp = new int[d];
        for(int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for(int i = 0; i < n-d; i++) {
            arr[i] = arr[i+d];
        }

        for(int i = n-d; i< n; i++) {
            arr[i] = temp[i-(n-d)];
        }
    } 
}






