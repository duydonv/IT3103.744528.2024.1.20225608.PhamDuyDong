import java.util.Scanner;
public class bai66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pham Duy Dong - 5608 - Chon cach nhap ma tran:");
        System.out.println("Pham Duy Dong - 5608 - 1. Nhap ma tran tu ban phim");
        System.out.println("Pham Duy Dong - 5608 - 2. Su dung ma tran hang so");
        System.out.print("Pham Duy Dong - 5608 - Nhap lua chon (1 hoac 2): ");
        int choice = scanner.nextInt();

        int rows, cols;
        int[][] matrix1, matrix2, resultMatrix;

        if (choice == 1) {
            System.out.print("Pham Duy Dong - 5608 - Nhap so hang cua ma tran: ");
            rows = scanner.nextInt();
            System.out.print("Pham Duy Dong - 5608 - Nhap so cot cua ma tran: ");
            cols = scanner.nextInt();

            matrix1 = new int[rows][cols];
            matrix2 = new int[rows][cols];
            resultMatrix = new int[rows][cols];

            System.out.println("Pham Duy Dong - 5608 - Nhap cac phan tu cua ma tran 1:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Pham Duy Dong - 5608 - Nhap phan tu [" + i + "][" + j + "]: ");
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Pham Duy Dong - 5608 - Nhap cac phan tu cua ma tran 2:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Pham Duy Dong - 5608 - Nhap phan tu [" + i + "][" + j + "]: ");
                    matrix2[i][j] = scanner.nextInt();
                }
            }
        } else {
            
            rows = 3; 
            cols = 3;  

            // Initialize constant matrices
            matrix1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6}, 
                {7, 8, 9}
            };
            matrix2 = new int[][]{
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            };
            resultMatrix = new int[rows][cols];

            System.out.println("Pham Duy Dong - 5608 - Su dung ma tran hang so:");
            System.out.println("Pham Duy Dong - 5608 - Ma tran 1:");
            displayMatrix(matrix1);
            System.out.println("Pham Duy Dong - 5608 - Ma tran 2:");
            displayMatrix(matrix2);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Pham Duy Dong - 5608 - Ma tran ket qua sau khi cong:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
