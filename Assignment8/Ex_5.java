// Java Program to Remove All the Elements from the First
// Collection if it is not Available in the Second
// Using ArrayList.contains() Method

// Importing input output classes
import java.util.Arrays;
import java.util.Random;
// Importing utility classes
import java.util.ArrayList;

// Main class
public class Ex_5 {

	// Method 1 of this class
	// To remove the elements from the collection
	static ArrayList<Character>RemoveElements(ArrayList<Character> arrayList1,ArrayList<Character> arrayList2)
	{
       
		// Iterating over elements in object
		// using for loop
		for (int i = 0; i < arrayList1.size(); ++i) {

			// Removing the elements from the collection
			if ( arrayList2.contains(arrayList1.get(i)) == false) {
				arrayList1.remove(i);
			}
		}
		// Returning the update ArrayList
		return arrayList1;
	}

	// Method 2 of this class
	// To print the collection
	static void print(ArrayList<Character> a)
	{
       
		// Iterating over elements in object
		// using for-each loop
		for (int element : a) {

			// Printing the elements of the linked list
			System.out.print(element + " ");
		}
	}

	// Method 3 of this class
	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of ArrayList class
		// Declaring object of Integer type
        Random rnd = new Random();
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char randomChar=' ';
		ArrayList<Character> arrayList1 = new ArrayList<>();

		// Inserting elements to ArrayList object
		// Custom input entries
         System.out.println("Array1:");
        for(int i=0;i<10;i++){
            int index = rnd.nextInt(alphabet.length());
            randomChar = alphabet.charAt(index);
          
            
            
        }
        System.out.println();
        
		// A.add('A');
		// A.add('B');
		// A.add('C');
		// A.add('D');

		// Creating another object of ArrayList class
		// Again declaring object of Character type
		ArrayList<Character> arrayList2 = new ArrayList<>();

		// Inserting elements to ArrayList object
		// Custom input entries
		// B.add('A');
		// B.add('B');
		// B.add('C');
        System.out.println("Array2:");
      
        for(int k=0;k<10;k++){
            int index = rnd.nextInt(alphabet.length());
            randomChar = alphabet.charAt(index);
           
            for(int j = 0;j<arrayList2.size();j++){

                System.out.print(randomChar+" ");

            }
            

        }
	

		// RemoveElements(arrayList1, arrayList2);

		// Lastly printing the updated collection
		// print(arrayList1);
	}
}
