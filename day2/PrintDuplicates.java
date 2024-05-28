package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		
		System.out.println(" Double Loop ");
		
		for (int j=0; j< num.length-1; j++) {
			for(int k= j+1; k < num.length-1; k++) {
				if(num[j]==num[k]) {
					System.out.println(num[k]);
				}
			}
		}
		System.out.println(" Single Loop ");
		Arrays.sort(num);
		for (int i = 0 ; i< num.length -1 ; i++) {			
			if(num[i] == num[i+1]) {
				System.out.println(num[i]);
			}
		}
	}
}
