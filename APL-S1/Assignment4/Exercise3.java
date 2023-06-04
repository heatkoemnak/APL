//Iterate over a2D array diagonally right down using pointers
public class Exercise3 {
    public static void main(String[] args)
    {
        int rows = 5, columns = 4;
        int[][] arr = new int[rows][columns];
        // initializing the array elements using for loop
        for (int i = rows-1; i > 0; i--) {
            for (int j = 0; j<columns; j++) {
				arr[i][j]=i+j;
                System.out.print(arr[i][j]+" ");
            }
			System.out.println();
        }
    }

    
}
