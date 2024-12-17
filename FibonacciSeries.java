// Experiment Name: Fibonacci sequence
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

/* The Fibonacci sequence is a type series where each number is the sum of the two that precede it. It starts from 0 and 1 usually.
The Fibonacci sequence is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on. */
  
// Source Code

public class FibonacciSeries {
    public static void main(String[] github) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        System.out.println("\Fibonacci Series is: ");
        System.out.print(num1 + " " + num2 + " ");

        while (num3 < 100) { // Added condition to prevent infinite loop
            num3 = num1 + num2;
            if (num3 <= 100) // Condition to assure that Fibonacci Series upto 100
            System.out.print(num3 + " ");

            num1 = num2;
            num2 = num3;
        }
        System.out.println("\n");
    }
}
