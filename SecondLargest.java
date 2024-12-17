// Experiment Name: Find the second largest number from three distinct numbers.
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

//Source Code

import java.util.*;
public class SecondLargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T[] = new int[3];
        System.out.println("\nEnter three numbers. Hit enter after entering each number.");
        System.out.println("Condition each number must be distinct.\n");

        for(int i = 0; i < 3; i++){
            T[i] = sc.nextInt();
        }

        if ((T[0] < T[1] && T[0] > T[2]) || (T[0] < T[2] && T[0] > T[1])) {
            System.out.println("\n" + T[0] + " is a second largest number.\n");
        }

        else if ((T[1] < T[0] && T[1] > T[2]) || (T[1] < T[2] && T[1] > T[0])) {
            System.out.println("\n" + T[1] + " is a second largest number.\n");
        }

        else {
            System.out.println("\n" + T[2] + " is a second largest number.\n");
        }
    }
}
