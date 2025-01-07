/*Liner Search*/
import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of num");
        int num = sc.nextInt();
        LinerSerach(arr,n,num);
    }
    static void LinerSerach(int[] arr, int n, int num) {
        
        for(int i = 0; i <n ; i++) {
            if(arr[i] == num) {
                System.out.print("The number " + num + " is found at index " + i);
            }
        }
    }
}