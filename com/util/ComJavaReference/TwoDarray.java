package com.util.ComJavaReference;

//Demonstrates a two-dimensional array.
public class TwoDarray {
public static void main(String[] args) {
	int twoD[][]=new int[4][5];
	int i,j,k=0;
	for (i=0;i<4;i++){
		for (j=0;j<5;j++){
			twoD[i][j]=k;
			System.out.print( twoD[i][j] + " ");
			k++;
		}
		System.out.println();
	}
}

}
