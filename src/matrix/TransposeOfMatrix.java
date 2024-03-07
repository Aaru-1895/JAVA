package matrix;

import java.util.Arrays;

public class TransposeOfMatrix {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{1, 1 ,1},
				{2, 2, 2},
				{3, 3, 3}
          };
		int temp;
		for(int row=0;row<arr.length;row++) {
			
			for(int col = 0;col<row;col++) {
				
				temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			System.out.print(arr[i][j]+" ");    
			}    
			System.out.println();//new line    
			}   
	
		
	}

}
