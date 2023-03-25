// package Assignment2;
import java.util.Scanner;

public class Case2 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter your sentances:");
      // create a string
      String message = input.nextLine();
     

      // stores each characters to a char array
      char[] charArray = message.toCharArray();
      boolean foundSpace = true;

      for (int i = 0; i < charArray.length; i++) {

        // if the array element is a letter
        if (Character.isLetter(charArray[i])) {

          // check space is present before the letter
          if (foundSpace) {

            // change the letter into uppercase
            charArray[i] = Character.toUpperCase(charArray[i]);
            foundSpace = false;
          }
        }

        else {
          // if the new character is not character
          foundSpace = true;
        }
      }

      // convert the char array to the string
     
      message = String.valueOf(charArray);
      System.out.println("Message: " + message);
      

    }

  }
}
