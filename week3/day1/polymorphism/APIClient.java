package week3.day1.polymorphism;

public class APIClient {

	// method Overloading Example
	
	public void sendRequest() {
		System.out.println("Empty Param");
	}

	public void sendRequest(String endPoint) {
		System.out.println("One String param");
	}
	
	public void sendRequest(int a) {
		System.out.println("One Int param");
	}
	
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println("Two String and one boolean param's");
	}
	public static void main(String[] args) {
		
		APIClient a1 = new APIClient();
		
		// method Overloading Example
		a1.sendRequest();
		a1.sendRequest(1);
		a1.sendRequest("200");
		a1.sendRequest(200);
		a1.sendRequest("200", "Success", true);	

	}

}
