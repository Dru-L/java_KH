package com.kh.practice.dimension;

import java.math.*;

public class DimensionPracticeAgain {
	public void practice1() {
		final int ROW =4;
		final int COL =4;
		
		int[][] arr = new int[ROW][COL];
		
		for(int i=0;i<ROW-1;i++) {
			for(int j=0; j<COL-1; j++) {
				int random = (int) ((Math.random() * 10) + 1);
				arr[i][j] = random;
			}
		}
		
		for(int i=0;i<ROW-1;i++) {
			for(int j=0; j<COL-1; j++) {
				arr[i][3] += arr[i][j];
			}
		}
		for(int i=0; i<COL; i++) {
			for(int j=0;j<ROW-1;j++) {
				arr[3][i] += arr[j][i];
			}
		}
	}

}
