import java.util.Scanner;
public class Exercise5 {
    public static void sum( int [][]first, int[][] secnd) {
        int row = first.length;
        int col = secnd.length;
        int[][] sum = new int[row][col];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                sum[r][c] = first[r][c] + secnd[r][c];

                System.out.print( "\t"+sum[r][c]);
            
            }
            System.out.println();
        }
        
        
    }
    
    public static void display_Matrixs(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix.length; c++) {
				System.out.print("\t"+matrix[r][c]);
			}
			System.out.println();
		}
	}
    public static void main(String[] args){
        int first[][] =new int[3][3];
        int secnd[][] =new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix 1: ");
        
        for( int row =0 ;row < first.length;row++ ){
            for(int col =0; col<first.length;col++){
                first[row][col] = input.nextInt();
            }
            
        }
        System.out.println("Enter matrix 2:");

        for( int row =0 ;row < secnd.length;row++ ){
            for(int col =0; col<secnd.length;col++){
                secnd[row][col] = input.nextInt();
  
            }

        }
        System.out.println("Matrix 1:\n");
		display_Matrixs(first);

		System.out.println("Matrix 2:\n");
		display_Matrixs(secnd);
        System.out.println("Sum Matrix:\n");
        sum(first,secnd);

        




 
        
        

    }
    
    
}
