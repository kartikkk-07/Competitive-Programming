// Experiment Name: Reverse the string.
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

// Source code

import java.util.*;
public class StringReverse {
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
        String entered_string = sc.nextLine();

        String reversed_string = myReversedString(entered_string);
        System.out.println("Reversed string is: " + reversed_string);
    }
}
