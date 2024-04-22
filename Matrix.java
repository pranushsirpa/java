public class Matrix {
    private int[][] matrix;
    public Matrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }
    public void fillMatrix(int[][] values) {
        if (values.length != matrix.length || values[0].length != matrix[0].length) {
            System.out.println("Error");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = values[i][j];
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
            int[][] values = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        Matrix matrix = new Matrix(3, 3);
        matrix.fillMatrix(values);
        System.out.println("Matrix:");
        matrix.printMatrix();
    }
}
