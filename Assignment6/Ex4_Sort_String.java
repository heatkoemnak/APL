
import java.util.Arrays;
import java.util.Scanner;


class Ex4_Sort_String {
    
    public static String sort(String str,char[]arr){
        char temp;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[i]) {
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr);
        return str;
    }
 
    // Main method
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a String:");
        String str=input.next();
      
        char arr[] = str.toCharArray();  // Converting string into an array for computation
        sort(null, arr);
        
    }
}