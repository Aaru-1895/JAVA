package ArrayDemo;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FindMax {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,58,24,3,45,25456,10,2);
		Integer[] intArray = {1,58,24,3,45,25456,10,2};
		
		/*********************/
		Optional<Integer> a = list.stream().max((i,j) -> i.compareTo(j));
		System.out.println(a);
		
		/*********************/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length :");
		int length = sc.nextInt();
		int temp;
		int myArray[] = new int[length];
		System.out.println("Enter Array Element:");
		
		for(int i=0; i<myArray.length;i++) {
			myArray[i]= sc.nextInt();
		}
		
		for(int i=0;i<myArray.length;i++) {
			for(int j=i+1;j<myArray.length;j++) {
				if(myArray[i]>myArray[j]) {
					temp = myArray[i];
					myArray[i]=myArray[j];
					myArray[j] =temp;
				}
			}
		}
		System.out.println(myArray[myArray.length-1]);
}
}