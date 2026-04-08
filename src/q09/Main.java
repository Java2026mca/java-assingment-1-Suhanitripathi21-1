import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        // Read Matrix A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Read Matrix B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Perform Matrix Multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print Result Matrix
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append(C[i][j]);
                if (j < n - 1) row.append(" ");
            }
            System.out.println(row.toString());
        }
    }
}
