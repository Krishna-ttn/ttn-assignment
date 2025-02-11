package introtojava1;

public class MatrixOper {
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3}, {4,5,6},{7,8,9} };

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + j + ": " + colSum);
        }
    }
}
