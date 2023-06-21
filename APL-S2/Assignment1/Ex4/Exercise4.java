import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        int computer_num = 50; 
        int count = 0; 

        while (count < 50) {

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your guess number:");
            int number = input.nextInt();

            count++; 

            if (number < 50) {

                System.out.println("Your guess number is too low");
            }
            else if (number > 50) {

                System.out.println("Your guess number is too high"); 
            }
            else if (number == computer_num){

                System.out.println("Well done, you took  " + count + " attempts"); 
                input.close();
            }

        }

    }
}
//Group12