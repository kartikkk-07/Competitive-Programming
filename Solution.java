// Experiment Name: HackerRank- Loops I.
// Name: Kartik Vijaykumar Magdum
// Roll no.: 16
// Batch: T1

// Problem description: https://www.hackerrank.com/challenges/java-loops-i/problem

//Source Code

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(bufferedReader.readLine().trim());
       for(int i = 1; i <= 10; i++)
       {
           System.out.println( N + " x " + i + " = " + (N*i) );
       }
       bufferedReader.close();
   }
}
