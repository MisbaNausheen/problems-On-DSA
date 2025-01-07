import java.util.Scanner;
import java.util.ArrayList;
/*Brute force approach to move zeros at the end
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = MoveZeros(arr,n);
        for(int i = 0; i < n; i++ ) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    static int[] MoveZeros(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        int nz = temp.size();

         for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        for(int i = nz; i <n ;i++) {
            arr[i] = 0;
        }
        return arr;
    }
    
}*/
/*Optimal approach to move zeros at the end*/

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = MoveZeros(arr,n);
        for(int i = 0; i < n; i++ ) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    static int[] MoveZeros(int[] arr, int n) {
        int j = -1;
        for(int i = 0 ; i < n; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return arr;
        }

        for(int i = j+1; i < n; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}