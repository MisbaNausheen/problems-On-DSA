import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }
        int k = removeDuplicates(arr,n);
       System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr,int n) {
        int i = 0;
        for(int j = 0; j < n; j++) {
            if(arr[i] != arr[j]) 
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}