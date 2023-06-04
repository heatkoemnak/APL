import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    static ArrayList<Character>getIntersection(ArrayList<Character> arrayList1,ArrayList<Character> arrayList2)
	{
        Scanner in =new Scanner(System.in);
        Random rnd = new Random();
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char randomChar=' ';
        System.out.println("Enter random number:");
        int randomNumber=in.nextInt();
        
       
        for(int i=0;i<randomNumber;i++){
            arrayList1.add(randomChar);
            int index = rnd.nextInt(alphabet.length());
            randomChar = alphabet.charAt(index);
            System.out.print(randomChar+" ");
           
        }
        System.out.println();
        for(int i=0;i<randomNumber;i++){
            arrayList2.add(randomChar);
            int index = rnd.nextInt(alphabet.length());
            randomChar = alphabet.charAt(index);
            System.out.print(randomChar+" ");
           
        }
     
          //create arraylist to store the common elements
        ArrayList<Character>arrayList3 = new ArrayList<Character>();
		 // Find common elements
        // while iterating through list1
        for (Character temp : arrayList1) {

            // Check if the element is
            // present in list2 or not
            if (arrayList2.contains(temp)) {

                // Since present, add it to arrayList3
                arrayList3.add(temp);
            }
        }
        System.out.println();

        // print common elements from list 3
        System.out.println("Intersection : "+ arrayList3);
		// Returning the update ArrayList
		return arrayList1;
	}
    public static void main(String[] args){
        ArrayList<Character>arrayList1 = new ArrayList<Character>();
      
        ArrayList<Character>arrayList2 = new ArrayList<Character>();
        getIntersection(arrayList1, arrayList2);
       
     

    }
}
