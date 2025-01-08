/*To find the missing elements in given array*/
/*Brute-force Approach*/
/*import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       Missingelements(arr,n);
    }

    static void Missingelements(int[] arr, int n) {
        for(int i =1; i <= n; i++) {
            int flag = 0;
            for(int j = 0; j < n-1; j++) {
                if(arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("The missing elements is: " + i);
            }
        }
    }
}*/

/*Optimal Approach*/
import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       Missingelements(arr,n);
    }

    public static void Missingelements(int[] arr, int n) {
        int[] hash = new int[n+1];

        for(int i = 0; i < n-1; i++) {
            hash[arr[i]]++;
        }

        for(int i = 1; i <= n; i++) {
            if(hash[i] == 0) {
                System.out.println("The missing element is :" + i);
            }
        }
    }
}