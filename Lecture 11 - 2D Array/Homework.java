import java.util.Scanner;

public class Homework {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the column: ");
        int m = sc.nextInt();
        System.out.println("Matrix: ");
        int matrix[][] = new int[n][m];
        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Spiral Order Matrix is: ");
        int rowstart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;
        // To print spiral order matix
        while (rowstart <= rowEnd && colStart <= colEnd) {
            // 1
            for (int col = colStart; col < +colEnd; col++) {
                System.out.print(matrix[rowstart][col] + " ");
            }
            rowstart++;
            // 2
            for (int row = rowstart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;
            // 3
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
            // 4
            for (int row = rowEnd; row >= rowstart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            System.out.println();
        }
    }
}