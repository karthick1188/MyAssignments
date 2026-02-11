package week1.day2;

public class FibonacciSeriesAssignment {

	public static void main(String[] args) {
		
	
		int range = 8;
		
		int a = 0;
		int b = 1;
		
		System.out.println("FibonacciSeries:");
		
		for (int i = 0; i <8; i++) {
			
			System.out.println(a);
			if(i<range-1) {
				
				
				int c = a+b;
				a = b;
				b = c;
			}
			
		}	
						
	}		

}
