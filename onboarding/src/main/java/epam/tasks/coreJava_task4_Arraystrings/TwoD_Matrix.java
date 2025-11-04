package epam.tasks.coreJava_task4_Arraystrings;

import java.util.Scanner;

public class TwoD_Matrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input dimensions for first matrix
		System.out.print("Enter number of rows for Matrix A: ");
		int rowsA = scanner.nextInt();
		System.out.print("Enter number of columns for Matrix A: ");
		int colsA = scanner.nextInt();

		// Input dimensions for second matrix
		System.out.print("Enter number of rows for Matrix B: ");
		int rowsB = scanner.nextInt();
		System.out.print("Enter number of columns for Matrix B: ");
		int colsB = scanner.nextInt();

		// Create matrices
		int[][] matrixA = new int[rowsA][colsA];
		int[][] matrixB = new int[rowsB][colsB];

		// Input elements for Matrix A
		System.out.println("\nEnter elements of Matrix A:");
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsA; j++) {
				System.out.print("A[" + i + "][" + j + "]: ");
				matrixA[i][j] = scanner.nextInt();
			}
		}

		// Input elements for Matrix B
		System.out.println("\nEnter elements of Matrix B:");
		for (int i = 0; i < rowsB; i++) {
			for (int j = 0; j < colsB; j++) {
				System.out.print("B[" + i + "][" + j + "]: ");
				matrixB[i][j] = scanner.nextInt();
			}
		}

		// Ask user for operation
		System.out.println("\nChoose operation:");
		System.out.println("1. Add Matrices");
		System.out.println("2. Multiply Matrices");
		System.out.print("Enter choice (1 or 2): ");
		int choice = scanner.nextInt();

		// Perform operation
		if (choice == 1) {
			if (rowsA == rowsB && colsA == colsB) {
				int[][] sum = new int[rowsA][colsA];
				for (int i = 0; i < rowsA; i++) {
					for (int j = 0; j < colsA; j++) {
						sum[i][j] = matrixA[i][j] + matrixB[i][j];
					}
				}
				System.out.println("\nResult of Matrix Addition:");
				printMatrix(sum);
			} else {
				System.out.println("\n❌ Matrices cannot be added. Dimensions must be the same.");
			}
		} 
		else if (choice == 2) {
			if (colsA == rowsB) {
				int[][] product = new int[rowsA][colsB];
				for (int i = 0; i < rowsA; i++) {
					for (int j = 0; j < colsB; j++) {
						for (int k = 0; k < colsA; k++) {
							product[i][j] += matrixA[i][k] * matrixB[k][j];
						}
					}
				}
				System.out.println("\nResult of Matrix Multiplication:");
				printMatrix(product);
			} else {
				System.out.println("\n❌ Matrices cannot be multiplied. Columns of A must equal rows of B.");
			}
		} 
		else {
			System.out.println("\nInvalid choice! Please select 1 or 2.");
		}

		scanner.close();
	}

	// Method to display a matrix
	private static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int value : row) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}
}
