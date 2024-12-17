/*Find the largest element in the given array*/
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the array elements:");
        for(int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }
        LargestElement(arr,n);
    }

    static void LargestElement(int[] arr,int n) {
        int max = arr[0];
        for(int i = 0; i <= n-1; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
    }
}