package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

	
int score = 0;
		
JOptionPane.showMessageDialog(null, "Rules: Please enter one-word, lower-case, answers only. Make sure to spell it right too.");
String answer = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");
		
if ( answer.equals("stamp")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	JOptionPane.showMessageDialog(null, "Wrong");
	JOptionPane.showMessageDialog(null, "Correct answer: stamp");
}

//-----------------------------------------------------------------------------------------------------------------------

String answer2 = JOptionPane.showInputDialog(null, "What has a head and a tail, but no body?");

if ( answer2.equals("coin")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	JOptionPane.showMessageDialog(null, "Wrong");
	JOptionPane.showMessageDialog(null, "Correct answer: coin");
}

//-----------------------------------------------------------------------------------------------------------------------

String answer3 = JOptionPane.showInputDialog(null, "Take off my skin - I won't cry, but you will! What I am?");

if ( answer3.equals("onion")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	JOptionPane.showMessageDialog(null, "Wrong");
	JOptionPane.showMessageDialog(null, "Correct answer: onion");
}

//-----------------------------------------------------------------------------------------------------------------------

JOptionPane.showMessageDialog(null, "Score: " + score + "/3" );
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

