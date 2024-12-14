// Experiment Name: Check whether the given number is odd or even.
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

// Source Code

import java.util.*;
public class OddEven {
    public static void main(String args[]){
        Scanner no = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = no.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.\n");            
        }

        else{
            System.out.println(num + " is an odd number.\n");
        }
    }
}
