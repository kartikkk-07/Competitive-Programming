// Experiment Name: Check whether the given number is prime or not.
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

// Source Code

import java.util.*;
public class Prime123 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int num = test.nextInt();
        int flag = 0;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Given number "+ num +" is not a Prime Number.\n");
        } else{
            System.out.println("Given number "+ num +" is a Prime Number.\n");
        }
    }
}
