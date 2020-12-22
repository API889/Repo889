package oops;

import java.util.Scanner;

public class MatrixTryCatch {
	
	public static void main(String[] args) {
		/*
		 * int r=4,c=4; int mat1[][]= {{1,2}, {3,4}}; int mat2[][]= {{5,6}, {7,8}};
		 */
		try {
		int mat1[][],mat2[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int r=sc.nextInt();
		System.out.println("Enter the number columns ");
		int c=sc.nextInt();
		System.out.println("U have entered "+r+"rows, "+c+" columns for matrix operations " );
		System.out.println("please enter 1. addition  2. subtraction  3. Square  4.Multiplication "); 
		int n = sc.nextInt();
		System.out.println("Enter values for matrix1 & matrix 2 ");
		mat1=new int[r][c];
		mat2=new int[r][c];
		
		int[][] sum = new int[r][c];
		int[][] sub = new int[r][c];		
		int[][] sqr = new int[r][c];	
		int[][] mul = new int[r][c];
		for(int i=0;i<2;i++)
 		{
	 		for(int j=0;j<2;j++)
	 		{		 			
	 			mat1[i][j]=	sc.nextInt();
	 			System.out.println(mat1[i][j]);
	 		}
	 	}
		for(int i=0;i<2;i++)
 		{
	 		for(int j=0;j<2;j++)
	 		{		 			
	 			mat2[i][j]=	sc.nextInt();
	 			System.out.println(mat2[i][j]);
	 		}
	 	}		
		switch(n) {
		case 1: System.out.println("U choosen addition of two matrix--------result matrix is:");
				for(int i=0;i<2;i++)
		 		{
			 		for(int j=0;j<2;j++)
			 		{			 			 			
			 	 		sum[i][j]+=mat1[i][j]+mat2[i][j];
						System.out.print(sum[i][j]+" ");
			 		}

		 		}
				break;
		 case 2: System.out.println("U choosen subtraction of two matrix--------result matrix is:");
				for(int i=0;i<2;i++)
				{
			 		for(int j=0;j<2;j++)
			 		{			 			 			
			 	 		sub[i][j]+=mat1[i][j]-mat2[i][j];
						System.out.print(sub[i][j]+" ");
			 		}
				}
				break;
		 case 3:System.out.println("U choosen square of two matrix--------result matrix is --");
				for(int i=0;i<2;i++)
					{
			 		for(int j=0;j<2;j++)
			 		{			 			 			
			 	 		sqr[i][j]+=mat1[i][j]*mat1[i][j];
						System.out.print(sqr[i][j]+" ");
			 		}
				}
				break;
		 case 4:
			 System.out.println("U choosen Multiplication of two matrix--------result matrix is --");
				for(int i=0;i<2;i++)
					{
			 		for(int j=0;j<2;j++)
			 		{			
			 			for(int k=0;k<2;k++)
			 			{
			 	 	
			 				mul[i][j]+=mat1[i][k]*mat2[k][j];
			 			}
			 		}
				}
			 	for(int i=0;i<2;i++)
				{
			 	 for(int j=0;j<2;j++)
			 		{
			 		System.out.print(mul[i][j] + " ");
			 		}
			 		System.out.println();
				}
				break;
		 }
		}catch(Exception e) 
			{
			System.out.println("Error  "+e);
			}
	}

}
