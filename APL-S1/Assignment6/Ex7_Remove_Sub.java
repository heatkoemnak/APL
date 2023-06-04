
import java.util.Scanner;

class Ex7_Remove_Sub {

    public static void main(String[] args) {

        // allow user to input string and substring
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        System.out.print("Remove the substring: ");
        String substr = input.nextLine();
        input.close();

        // remove substring form string
        System.out.println(RemoveSub(str, substr));

    }

    // method removeSubstring allow parameter "string, substring"
    public static String RemoveSub(String str, String substr) {
        if (substr.isEmpty()) {
            return str;
        }
        String result = str.replaceAll(substr, "");
        return result;
    }
}
