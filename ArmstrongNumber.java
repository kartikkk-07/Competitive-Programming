// Experiment Name: Check whether the number is an Armstrong number or not. 
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

/* An Armstrong number is a number that is equal to the sum of its digits, each raised to the power of the number of digits in the number: 
Explanation: For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153. */

//Source Code

import java.util.Scanner;
class ArmstrongNumber {
    public static int countDigit(int no) {
        int counter = 0;
        while (no > 0) {
            no = no / 10;
            counter++;
        }
        return counter;
    }
    public static void ArmstrongChecker(int no) {
        int num = no;
        int nod = countDigit(no); 
        int result = 0;
        while (no > 0) {
            int digit = no % 10;
            int res = 1;
            for (int i = 0; i < nod; i++) {
                res = res * digit;
            }
            result = result + res;
            no = no / 10;
        }

        if (num == result)
            System.out.println(num + " is an armstrong number\n");
        else
            System.out.println(num + " is not an armstrong number\n");
    }
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any number: ");
        int no = sc.nextInt();
        int digits = countDigit(no);
        System.out.println("Total Digits: " + digits);
        ArmstrongChecker(no);
    }
}
