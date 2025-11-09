import java.util.Random;

public class MatrixCalculation {
    private int[][] matrix;
    private int rows, cols;
    
    public MatrixCalculation(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
        Random rand = new Random();
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }
    
    public void displayMatrix() {
        System.out.println("\nMatrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public int sumDiagonal() {
        if(rows != cols) return -1; // Not square matrix
        
        int sum = 0;
        for(int i = 0; i < rows; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    
    public int[] sumRows() {
        int[] rowSums = new int[rows];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                rowSums[i] += matrix[i][j];
            }
        }
        return rowSums;
    }
    
    public void transpose() {
        int[][] transposed = new int[cols][rows];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        
        matrix = transposed;
        // Swap dimensions
        int temp = rows;
        rows = cols;
        cols = temp;
    }
    
    
    public static void main(String[] args) {
        MatrixCalculation calc = new MatrixCalculation(3, 3);
        calc.displayMatrix();
        
        System.out.println("Diagonal Sum: " + calc.sumDiagonal());
        
        int[] rowSums = calc.sumRows();
        System.out.println("Row Sums: " + java.util.Arrays.toString(rowSums));
        
        calc.transpose();
        System.out.println("After Transpose:");
        calc.displayMatrix();
    }
}