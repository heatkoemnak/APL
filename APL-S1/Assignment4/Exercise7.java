import java.util.Scanner;


public class Exercise7 {

   public static void main(String[] args) {
    String[][] capitals = {
        {"Cambodia", "Phnom Penh"},
        {"Thailand", "Bangkok"},
        {"China", "Beijing"},
        {"Japan", "Tokyo"},
        {"India", "Delhi"},
        {"Maylaysia", "Kuala Lumpur"},
        {"Singapor", "Singapor"},
        {"Myanmar", "Burma"}, 
        {"USA", "New York"},
        {"Laos", "Vientiane"}};

        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        for (int i = 0; i < capitals.length; i++) {
            i= (int)(Math.random() * capitals.length);
            System.out.print("What is the capital of " + capitals[i][0]+"? ");
            String s = input.nextLine();
            if (s.equalsIgnoreCase(capitals[i][1])) {
                System.out.println("Your answer is correct!");
                correctCount++;
            } else {
                System.out.println("WRONG - The correct answer is " + capitals[i][1]);
            }
        }
        System.out.println("The correct count is " + correctCount);
    }

   


}