import java.util.Scanner;

public class ch4_ex1 {
    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 12: ");
        int input = scan.nextInt();

        try {
            String month = months[input - 1];
            int days = dom[input - 1];
            System.out.println("Month: " + month);
            System.out.println("Number of days: " + days);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wrong number");
        }
    }
}