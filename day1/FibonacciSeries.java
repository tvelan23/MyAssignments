package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
				
		int i = 0;
		int j = 1;
		int k;		
		System.out.println(i);
		System.out.println(j);
		for (int range = 0; range< 6; range++) {			
			k=i+j;
			i=j;
			j=k;
			System.out.println(k);
		}
	}
}
