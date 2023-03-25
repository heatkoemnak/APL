import java.util.Scanner;
public class Ex2_Even_Pal {
    static void generatepalindrome(int number){
        
        for(int i=0;i<number;i++){
			
            if(i%2==0){
				System.out.print(i+" ");
                
			}
			
        }
		
    }
   

    public static void main(String[] args){
        // palindromes obj =new palindromes();
        Scanner in = new Scanner(System.in);

        System.out.print("ENTER number :");
        int number = in.nextInt();
        generatepalindrome(number);
       
       


        

    }
}
