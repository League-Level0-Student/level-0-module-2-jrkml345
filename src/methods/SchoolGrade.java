package methods;

import javax.swing.JOptionPane;

public class SchoolGrade {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your current grade for math?");
int grade = Integer.parseInt(answer);
if(grade >= 70 ) {
JOptionPane.showMessageDialog(null, "Congrats, you're passing! :)");
}
else {
JOptionPane.showMessageDialog(null, "Try raising up your grade to pass.<3");
}
}
}


