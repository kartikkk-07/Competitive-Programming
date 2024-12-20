// Experiment Name: Binary Search program.
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

// Source Code

import java.util.*;
public class BinarySearch {
    static Scanner sc;
    public static int Binary_Search(int arr[], int keyelement){
        int beg = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (beg <= end) {
            mid = (beg + end) / 2;

            if (arr[mid] == keyelement) {
                return mid;
            }
            if (keyelement < arr[mid]) {
                end = mid - 1;
            }
            else{
                beg = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("\nEnter five elements of array in ascending order.");
        int arr[] = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\nNow enter the key element to check if it is present or not: ");
        int keyelement = sc.nextInt();

        int result = Binary_Search(arr,keyelement);

        if (result == -1) {
            System.out.println("\nKey element " + keyelement + " is not found.\n");
        } 
        else {
            System.out.println("\nKey element " + keyelement + " is found at the index " + result + "\n");
        }
    }
}
