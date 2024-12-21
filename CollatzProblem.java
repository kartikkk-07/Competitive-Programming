// Experiment Name: 3n+1 Problem.
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

// Source Code:

import java.util.*;
public class CollatzProblem {
    public static void printSeries(long num){  // Formal Parameter
        System.out.print("Series: ");
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else{
                num = (3 * num) + 1;
            }
            System.out.print(num + "  ");
            if (num == 1){
                break;
            }
        }
        System.out.println();
    }

    public static void main(String[] github) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any non zero integer: ");
        long num = sc.nextLong();
        System.out.println("Entered number is: '" + num + "'\n");

        while(num<1){
            if (num == 0) {
                System.out.println("Error: You entered zero.\n");
                System.out.print("Re-enter any non zero integer: ");
                num = sc.nextLong();
            }
            else{
                System.out.println("Error: You entered negative integer.\n");
                System.out.print("Re-enter any non zero integer: ");
                num = sc.nextLong();
            }
            System.out.println("Entered number is: '" + num + "'\n");
        }
        printSeries(num);  // Actual Parameter
    }
}
