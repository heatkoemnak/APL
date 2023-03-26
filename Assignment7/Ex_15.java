
import java.util.Scanner;

public class Ex_15 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols= input.nextInt();

        System.out.println("Enter values into the matrix below: ");
 
        int[][]array=new int[rows][cols];
        for(rows = 0; rows < array.length; rows++){

            for(cols=0; cols <array[rows].length; cols++){
                
                array[rows][cols] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("_____________________________");
        
        isConsecutiveFour(array);

    }
    public static boolean isConsecutiveFour(int[][] values) {

       // checking rows
      
       for (int rows = 0; rows < values.length; rows++) {
        int current = values[rows][0];
        int consecutiveCount = 0; // values[i][0] starts count

            for (int cols = 0; cols < values[rows].length; cols++) {
                
                    if (values[rows][cols] == current)
                    consecutiveCount++;

                    if (consecutiveCount >= 4)
                    System.out.println("Consecutive on horizontally(row) :"+rows);
                    
                    if(values[rows][cols] != current)

                        consecutiveCount = 1;
                    
                }
        }
      
        // check columns
        for (int rows = 0; rows < values[0].length; rows++) {
          
            int current = values[0][rows];
            int consecutiveCount = 0;// values[0][rows] starts count

            for (int col = 0; col < values.length; col++) {


                if (values[col][rows] == current)
                    consecutiveCount++;
                    
                if (consecutiveCount == 4)
                    System.out.println("Consecutive on vertically(colum) :"+rows);

                if(values[col][rows] != current)
                
                    consecutiveCount = 1;

            }
        }
       
        // check down-Left side
        for (int rows = values.length - 1; rows > 0; rows--) {
            
            int col = 0;
            int consecutiveCount = 0;
            int current = values[rows][col];

            while (rows >= 0) {
                
                if (values[rows][col] == current) {
                    
                    consecutiveCount++;
                    
                    if (consecutiveCount >= 4) 
                    
                    System.out.println("Consecutive on diagonally(Down-Left).");
                    
                } else {
                    consecutiveCount = 1;
                    
                }
                col++;
                rows--;
            }
        }
        
        
        // check down-right side 
        for (int rows = 1 ; rows < values.length; rows++) {
            
            int col = values[0].length - 1;
           
            int consecutiveCount = 0;
            int current = values[rows][col];

            while (rows >= 0) {
                
                if (values[rows][col] == current) {
                    consecutiveCount++;
                    if (consecutiveCount >= 4)

                    System.out.println("Consecutive on diagonally(Down-Rigt).");
                } else {
                    consecutiveCount = 1;
                    
                }
                col--;
                rows--;
            }

        }
        return false;
    }

}
