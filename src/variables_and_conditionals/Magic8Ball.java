package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

    // 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

    // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random myRandom=new Random();
	int number=myRandom.nextInt(5);
    // 3. Print out this variable
JOptionPane.showMessageDialog(null, number);
    // 4. Get the user to enter a question for the 8 ball

    // 5. If the random number is 0

    // -- tell the user "Yes"
if (number==0) {
	JOptionPane.showMessageDialog(null, "Yes");
}
    // 6. If the random number is 1
if (number==1) {
	JOptionPane.showMessageDialog(null, "No");
}
    // -- tell the user "No"

    // 7. If the random number is 2
if (number==2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}
    // -- tell the user "Maybe you should ask Google?"

    // 8. If the random number is 3
if (number==3) {
	JOptionPane.showMessageDialog(null, "I'm sorry I can't answer that");
}
    // -- write your own answer

}}
