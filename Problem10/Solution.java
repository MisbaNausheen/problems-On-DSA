import java.util.Scanner;
import java.util.ArrayList;
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
    
}