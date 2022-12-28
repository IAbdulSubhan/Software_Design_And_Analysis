
import javax.swing.*; 

public class Swing {

	public static void main(String args[]){
		
	String input = JOptionPane.showInputDialog("Enter Number");
	int number = Integer.parseInt(input);
	
	int square = number*number; 
	
	JOptionPane.showMessageDialog(null, "The square of two numbers = " + square);
	}
	
 }
