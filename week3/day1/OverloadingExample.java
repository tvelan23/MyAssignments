package week3.day1;

public class OverloadingExample {

	public void reportStep() {
		System.out.println("No args");
	}
	
	public void reportStep(int x) {		
		System.out.println("Single argument int");
	}
	
	public void reportStep(String x) {
		System.out.println("Single argument String");

	}
	
	public void reportStep(String x, int y) {
		System.out.println("Double argument String ,Int");

	}
	
	public void reportStep(int x, String y) {
		System.out.println("Double argument Int, String");

	}
	
	public static void main(String[] args) {
		
	  OverloadingExample ol1 = new OverloadingExample();
	  ol1.reportStep();
	  ol1.reportStep(1);
	  ol1.reportStep("new1");
	  ol1.reportStep(1, " " );
	  ol1.reportStep(" ", 2);
	}

}
