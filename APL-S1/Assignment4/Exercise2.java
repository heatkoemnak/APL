//Iterate over a2D array diagonally right upusing pointers;

public class Exercise2 {
	public static void main(String[] args)
    {
        int rows = 5, columns = 4;
        int[][] arr = new int[rows][columns];
  
        // initializing the array elements using for loop
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
				arr[i][j]=i+j;
                System.out.print(arr[i][j]+" ");
            }
			System.out.println();
        }

    }

}


