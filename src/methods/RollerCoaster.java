package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("How tall are you?");
	int height = Integer.parseInt(answer);
	
	if(height >= 4) {
	JOptionPane.showMessageDialog(null, "Enjoy the ride! :)");
	}	
	else {
	JOptionPane.showMessageDialog(null, "sorry buddy, you need to wait a while.");
	
	}
}
}
