// package Assignment3;
//converting decimal to hexadecimal
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        int remainder;
        String hexadec_num ="";
      
        char hexa_num[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the decimal number:");
        int decimal= input.nextInt();

        while(decimal>0){
           
            remainder=decimal%16;
          
            hexadec_num =  hexa_num[remainder]+ hexadec_num ;
            decimal = decimal/16;
        }
        System.out.print("To hexadecimal number is:"+hexadec_num);


    }

    
}
