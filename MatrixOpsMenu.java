import java.util.Scanner;

public class MatrixOpsMenu {
    int m, n;
    int[][] a;

    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter matrix dimensions (m n): ");
        m = s.nextInt();
        n = s.nextInt();
        a = new int[m][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = s.nextInt();
    }

    public void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "  ");
            System.out.println();
        }
    }

    public void scalarProduct(int factor) {
        System.out.println("Scalar Product (×" + factor + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((a[i][j] * factor) + "  ");
            System.out.println();
        }
    }

    public void addMatrix() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter second matrix of same dimensions (" + m + "×" + n + "):");
    
        int[][] b = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = s.nextInt();
    
        System.out.println("Result after addition:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((a[i][j] + b[i][j]) + "  ");
            System.out.println();
        }
    }

    public void transpose() {
        System.out.println("Transpose:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++)
                System.out.print(a[i][j] + "  ");
            System.out.println();
        }
    }

    public void matrixProduct() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter dimensions of second matrix: ");
        int m2 = s.nextInt();
        int n2 = s.nextInt();

        if (n != m2) {
            System.out.println("Matrix multiplication not possible (dimension mismatch)");
            return;
        }

        int[][] b = new int[m2][n2];
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < m2; i++)
            for (int j = 0; j < n2; j++)
                b[i][j] = s.nextInt();

        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n2; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++)
                    sum += a[i][k] * b[k][j];
                System.out.print(sum + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixOpsMenu obj = new MatrixOpsMenu();
        obj.read();

        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Display");
            System.out.println("2. Scalar Product");
            System.out.println("3. Add Another Matrix");
            System.out.println("4. Transpose");
            System.out.println("5. Matrix Product");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    obj.display();
                    break;
                case 2:
                    System.out.print("Enter scalar value: ");
                    int factor = s.nextInt();
                    obj.scalarProduct(factor);
                    break;
                case 3:
                    obj.addMatrix();
                    break;
                case 4:
                    obj.transpose();
                    break;
                case 5:
                    obj.matrixProduct();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
