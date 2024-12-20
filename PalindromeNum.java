// Experiment Name: Check whether the given number is palindrome or not.
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

// Source Code

import java.util.*;
public class PalindromeNum {
    public static void main(String github[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number to check whether it is palindrome or not: ");
		int num = sc.nextInt();
		int orgNum = num;
		int sum = 0;
		
		System.out.println("\nEntered number is: "+orgNum);
		
		while (num>0){
			int digit = num % 10;
			sum = (sum * 10) + digit;
			num = num / 10;
		}
		
		if(orgNum == sum){
			System.out.println(orgNum+" is a Palindrome number\n");
		}
		else{
			System.out.println(orgNum+" is not a Palindrome number\n");
		}
	}
}
