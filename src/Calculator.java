import javax.swing.JFrame;

//create a class named Calculator
public class Calculator {
	
	//create a constructor named Calculator
	public Calculator(){
		JFrame jf=new JFrame("My Calculator");// create object for JFrame
		jf.setLayout(null);
		jf.setSize(600,600);//define JFrame size
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );// for closing the window
		
		
	//Write main method	
	}
	
	public static void main(String []args) {
	
		//Calculator cal=new Calculator();// create object for Calculator class
		new Calculator();
		
	}

}
