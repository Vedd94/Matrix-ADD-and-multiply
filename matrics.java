package MyCaptain;

import java.io.*;

public class Matrix {

	static void display(int a[][], int r , int c) {
		int i ,j;
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++)
			System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
	
	static int[][] add(int a[][], int b[][],int size){
		int i, j;
		int x[][] = new int[size][size];

		for (i = 0; i < size; i++)
			for (j = 0; j < size; j++)
				x[i][j] = a[i][j] + b[i][j];
		return x;
}
	
	static void multiply(int r1, int c1, int a[][],int r2, int c2, int b[][])
	    {
	        int i, j, k;
	        System.out.println("\nMatrix A:");
	        display(a, r1, c1);
	        System.out.println("\nMatrix B:");
	        display(b, r2, c2);
	        if (r2 != c1) {
	 
	            System.out.println(
	                "\nMultiplication Not Possible");
	            return;
	        }
	        
	        int c[][] = new int[r1][c2];
	 
	        
	        for (i = 0; i < r1; i++) {
	            for (j = 0; j < c2; j++) {
	                for (k = 0; k < r2; k++)
	                    c[i][j] += a[i][k] * b[k][j];
	            }
	        }
	        System.out.println("\n Multiplication of matrix is ");
	        display(c, r1, c2);
	    }

	public static void main(String[] args) {
		int size = 3;
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
		
		System.out.println("Elements of matrix a are");
		display(a,size,size);
		System.out.println("Elements of matrix a are");
		display(b,size,size);
		
		int c[][] = add(a,b,size);
		System.out.println("Addition of 2 matrix is ");
		display(c,size,size);
		
		 multiply(size, size,a,size,size, b);
}
	
		
}
