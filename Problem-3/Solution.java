import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i <= n-1; i++){
            arr[i] = sc.nextInt();
        }

        boolean result = Sorted(arr,n);
        if(result) {
            System.out.println("Array is sorted.");
        }
        else {
            System.out.println("Array is not sorted.");
        }

    }
    static boolean Sorted(int[] arr, int n) {
        for(int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}