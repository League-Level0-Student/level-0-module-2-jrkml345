
import java.util.Random;

import javax.swing.JOptionPane;


public class NumberGuessingGame {

	public static void main(String[] args) {
	int r = 0 ;
	for (int i= 0; i < 1; i++) {
		
	
	Random number = new Random();
	r = number.nextInt(3);
	
	String num = JOptionPane.showInputDialog("Choose a number inbetween 0 and 3");
	int barry = Integer.parseInt(num);
	if(barry == r ) {
		JOptionPane.showMessageDialog(null, "Good job. You guessed it right!");
	}
	else {
		JOptionPane.showMessageDialog(null, "sorry buddy");
		String input = JOptionPane.showInputDialog("Wanna try again");
		if(input.equals("yes")) {
			i--;
		}
	}
	}
	
}
}