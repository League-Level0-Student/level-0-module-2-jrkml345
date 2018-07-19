import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
int realage = Integer.parseInt(age);
	if (realage >= 18) {
	JOptionPane.showInputDialog("Who should the next president be?");
JOptionPane.showMessageDialog(null, "Thank you for your cooperation :)");
}
	else {
		JOptionPane.showMessageDialog(null, "No one cares what you think.");
	}

}
}
