// Experiment Name: Check whether the given string is palindrome or not.
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

// Source Code

import java.util.*;
public class PalindromeString  {
    public static String myReversedString(String str){
        char ch[] = str.toCharArray();
        String rev_string = "";
        
        for(int i = str.length() - 1; i >= 0; i--){
            rev_string = rev_string + ch[i];
        }
        return rev_string;
    }
    public static void main(String[] kk){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter string: ");
        String enteredString = sc.nextLine();

        String reversedString = myReversedString(enteredString);
        System.out.println("Reversed string is: " + reversedString + "\n");

        if(enteredString.equals(reversedString)){
            System.out.println("Given string ‘" + enteredString + "’ is a palindrome string....\n");
        }
        else{
            System.out.println("Given string ‘" + enteredString + "’ is not a palindrome string....\n");
        }
    }
}
