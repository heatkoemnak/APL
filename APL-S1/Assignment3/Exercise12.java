// package Assignment3;
import java.util.Scanner;
public class Exercise12 
{
 public static void main(String[] args) 
 {
  int[] hexa = new int[100]; // Declaring variables..
  int i = 1, j = 0, rem, decimal = 0, binary;
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a Binary Number: "); // Taking value  from user..
  binary = input.nextInt();
  while (binary > 0)   // converting values ...
  {   
   rem = binary % 2;
   decimal = decimal + rem * i; 
   i = i * 2;
   binary = binary / 10;
  }
   i = 0;
  while (decimal != 0) {
   hexa[i] = decimal % 16;
   decimal = decimal / 16;
   i++;
  }
  System.out.print("HexaDecimal value is : ");
  for (j = i - 1; j >= 0; j--)
  {
   if (hexa[j] > 9) 
   {
    System.out.print((char)(hexa[j] + 55));
   } else
   {
    System.out.print(hexa[j]);
   }
  }
 }
}
