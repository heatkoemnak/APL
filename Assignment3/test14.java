// package Assignment3;
import java.util.Scanner;

public class test14 {

    public static void main(String[] args) {
        String[] Words = new String[] { "programer", "penceil", "labtop", "mouse", "keyboard" };
        String randomWord = Words[(int) (Math.random() * Words.length)];
        System.out.println("The word has " + randomWord.length() + " letter.");
        char letters[] = new char[randomWord.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = '*';
            System.out.print(" " + letters[i]);

        }
        System.out.println();
        int lives = 4;
        while (lives > 0) {
            System.out.print("Your lives is:");
            for (int j = 1; j <= lives; j++) {

                System.out.print("O");

            }
            System.out.println();
            Scanner guess = new Scanner(System.in);
            System.out.print("Type your guess:");
            String word = guess.nextLine();
            char letter = word.charAt(0);
            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == letter) {
                    letters[i] = randomWord.charAt(i);// replace the blank with the letter (since we found it!)

                }
            }
            System.out.println();
            

            for (int i = 0; i < letters.length; i++) {
                if (letter == letters[i]) {
                    

                }
                System.out.print(letters[i]);

                

            }
            
          
        }
            
        

        }



}
