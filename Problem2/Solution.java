/* Find Second Smallest and Second Largest Element in an array
Problem Statement: Given an array, find the second smallest and second largest element in the array.
 Print ‘-1’ in the event that either of them doesn’t exist
 */
import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the array elements:");
        for(int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }

        findSecondSmallest(arr,n);
        findSecondLargest(arr,n);
    }

    static void findSecondSmallest(int[] arr, int n) {
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
    
        for(int i = 0; i <= n-1; i++) {
            if (arr[i] < small) {
                second_small = small;
                small= arr[i];
            }
            else if(arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        System.out.println("The 2nd smallest element is : " + second_small); 

    }

    static void findSecondLargest(int[] arr, int n) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int i =0; i <= n-1; i++) {
            if(arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            }
            else if(arr[i] > secondLarge && arr[i]!=large) {
                secondLarge = arr[i];
            }
        }
        System.out.println("The secong large element is :" + secondLarge);
    }
}