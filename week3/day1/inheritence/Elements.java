package week3.day1.inheritence;

public class Elements extends Button{

	public static void main(String[] args) {
		
		WebElement we1 = new WebElement();
		we1.click();
		we1.setText("Inheritence Example");
		
		Button b1 = new Button();
		b1.click();
		b1.setText("Button Class");
		b1.submit();
		
		TextField tf1 = new TextField();
		tf1.click();
		tf1.setText("TextField Class");
		tf1.getText();
		
		CheckBoxButton cb1 = new CheckBoxButton();
		cb1.click();
		cb1.setText("Check box Field Class");
		cb1.clickCheckButton();
		
		RadioButton rb1 = new RadioButton();
		rb1.click();
		rb1.setText("RadioButton class...");
	    rb1.selectRadioButton();
	    
	    Elements e1 = new Elements();
	    e1.click();
	    e1.setText("Elements Class");
	    e1.submit();

	}

}
