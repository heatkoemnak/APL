// package Assignment2;
import java.util.Arrays;
public class Case3 {
   public static void main(String[] args) {
      String Countries[] = { "Cambodia", "Thailand", "Veitnam", "Philipin", "Singapor" };
      System.out.print("Alphabetical in order is -> ");

    //   use the Arrays.sort() method to sort an array in alphabetical order.
      Arrays.sort(Countries, String.CASE_INSENSITIVE_ORDER);
      for (int a = 0; a < Countries.length; a++) {
         System.out.print(Countries[a]+", ");
      }
   }
}