package week3.day1;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("I am in Egde class - takeSnap");
	}
	
	public void clearCookies() {
		System.out.println("I am in Egde class - clearCookies");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edge e1 = new Edge();
		e1.takeSnap();
		e1.clearCookies();
		
		//Grand parent attributes
		e1.browserName = "Edge";
		System.out.println(e1.browserName);
		e1.navigateBack();
	}

}
