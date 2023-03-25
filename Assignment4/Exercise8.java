import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] overTime = {
                { 2, 4, 3, 4, 5, 8, 8 },
                { 7, 3, 4, 3, 3, 4, 4 },
                { 3, 3, 4, 3, 3, 2, 2 },
                { 9, 3, 4, 7, 3, 4, 1 },
                { 3, 5, 4, 3, 6, 3, 8 },
                { 3, 4, 4, 6, 3, 4, 4 },
                { 3, 7, 4, 8, 3, 8, 4 },
                { 6, 3, 5, 9, 2, 7, 9 } };
        int[][] sum = new int[8][2];

        for (int i = 0; i < overTime.length; i++) {
            for (int j = 0; j < overTime[0].length; j++) {
                System.out.println(overTime[i][j]);

            }

            // sum loop
            for (i = 0; i < overTime.length; i++) {
                for (int j = 0; j < overTime[0].length; j++) {
                    sum[i][1] += overTime[i][j];
                }
                sum[i][0] = i;
            }

            selectionSort(sum);

            // printing

            // printing out result

            for (int j = sum.length - 1; j >= 0; j--) {
                System.out.println("Employee " + sum[j][0] + "'s overtime is " +sum[j][1]);
            }
        }

    }

    public static void selectionSort(int[][] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j][1]) {
                    currentMin = list[j][1];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex][1] = list[i][1];
                list[i][1] = currentMin;
                list[currentMinIndex][0] = list[i][0];
                list[i][0] = currentMinIndex;

            }
        }
    }

}
