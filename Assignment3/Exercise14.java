// package Assignment3;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        StringBuilder pastguesses = new StringBuilder();
        String[] Words = new String[] { "programer", "penceil", "labtop", "mouse", "keyboard" };
        String randomWord = Words[(int) (Math.random() * Words.length)];//chooses random word from the word array
        System.out.println("The word has " + randomWord.length() + " letter.");

        char letters[] = new char[randomWord.length()];// creates char array of string
        // Filling foundLetters with underslashes based on the length of the secret
        // word.
        for (int i = 0; i < letters.length; i++) {
            letters[i] = '*';//dashes to represent the correct word.
        }
        int lives = 4;
        // Main loop to take guesses
        while (lives > 0) {
            // Initialize all variables in loop
            char letter;
            String scanner;
            String tempstring;
            

            System.out.print("your lives is:");
            for (int j = 1; j <= lives; j++) {
                System.out.print("O");
            }
            System.out.println();

            // asks user for guess, then stores guess in Char guess and String letter
            Scanner guess = new Scanner(System.in);
            System.out.print("Type your guess:");
            scanner = guess.nextLine();
            letter = scanner.charAt(0);// gets char data from scanner
            pastguesses.append(letter); // adds guess to previous guess string
            tempstring = pastguesses.toString();

            //checks if user already guessed the letter previously
            
            if (tempstring.lastIndexOf(letter, tempstring.length() - 2) != -1) {
            System.out.println("letter " + letter + " is already guessed! Guess again.");
            
            }
            // check if letter is equal to random word then store into array
            boolean isGuessCorrect = false;
            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == letter) {
                    letters[i] = randomWord.charAt(i);
                    isGuessCorrect = true;

                }
            }

            if (!isGuessCorrect) {

                lives = lives - 1;

            }

            System.out.println();
            boolean isGameFinished = true;

            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == letter) {
                    isGameFinished = false;

                }
                System.out.print(letters[i]);

            }


            System.out.println();
            System.out.println("----------------------------------");
            if (isGameFinished) {
                System.out.println("You won!");
                break;
            }
            if (lives == 0) {
                System.out.print("You lost the game!");
            }

        }
        System.out.print("The word is " + randomWord.toUpperCase());

    }

};