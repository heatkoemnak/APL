import java.util.Arrays; 
import java.util.Scanner;

public class Ex_16 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // index at which the element is to be deleted 
        System.out.print("Enter element that you want to remove:");
        int index=in.nextInt();
        // define the array of integers
        int[] arr = new int[]{1,3,3,4,5};
        // display the original array 
        System.out.println("Original Array: "+ Arrays.toString(arr)); 
        // the index 
        System.out.println("Element to be deleted at index: "+ index); 
    
        RemoveINT(arr, index);

    }
    
    public static void RemoveINT(int[]arr,int index){
        
        System.out.println("Before deletion :" + Arrays.toString(arr));
        int count =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == index){
                count++;

                // shifting elements
                for(int k = i; k < arr.length - 1; k++){
                    arr[k] = arr[k+1];
                }
                i--;
               // break;
            }
        }

        System.out.print("After Deletion :" );
        for(int i = 0; i < arr.length-count; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        

    }
       
    
       
        
}
