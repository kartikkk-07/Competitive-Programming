/* Experiment Name: Mathematical operations using command line arguments
   Roll no.: 16
   Name: Kartik Vijaykumar Magdum
   Batch: T1 */

//Code

class demo
{
    public static void main(String vk[])
    {
    
   	 int no1 = Integer.parseInt(vk[0]);
   	 int no2 = Integer.parseInt(vk[1]);
   	 
   	 System.out.println("\nAddition of " + no1 + "+" + no2 + " is: " + (no1 + no2));
   	 System.out.println("Substraction of " + no1 + "-" + no2 + " is: " + (no1 - no2));
   	 System.out.println("Multiplication of " + no1 + "*" + no2 + " is: " + (no1 * no2));
   	 System.out.println("Division of " + no1 + "/" + no2 + " is: " + (no1 / no2));
    } 
}
