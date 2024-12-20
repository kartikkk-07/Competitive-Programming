// Experiment Name: Linear search program.
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

// Source Code

import java.util.Scanner;
public class LinearSearch {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("\nEnter five elements of an array.");
        int Kartik[] = new int[5];
        for(int i = 0; i < 5; i++){
            Kartik[i] = sc.nextInt();
        }

        System.out.print("\nEnter key element to check: ");
        int element = sc.nextInt();
        int flag = 0;
        for(int i = 0; i < 5; i++){
            if (Kartik[i] == element) {
                System.out.println("\nKey element " + element + " is present at " + i + " index.\n");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
          System.out.println("\nKey element " + element + " is not present.\n");  
        } 
    }
}
