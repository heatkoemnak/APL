import java.util.Arrays;
import java.util.Comparator;
public class Exercise4{
    static void columnWiseSorting(int arr[][], int colmn) {
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] frst, int[] scnd) {

                if(frst[colmn] > scnd[colmn]) {

                    return 1;
                    }
                    else return -1;
                    }
                    });
                    //display sorted array 
                    for(int i = 0; i< arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();

                    }
    
}
    public static void main(String[] args) {
        int arr[][] = new int [][]{ {4,  2},  {1,  7},  {4,  5},  {1, 2},  {3,  1},  {4,  1}};
                columnWiseSorting(arr,1);
        }
}
