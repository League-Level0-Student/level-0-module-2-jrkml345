import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	 String mood  = JOptionPane.showInputDialog("Are you Happy?");
	  if (mood.equals("yes")) { 
		  JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
	 }
	  else {
		  JOptionPane.showMessageDialog(null, "");
		  
	  }
			 
}
}