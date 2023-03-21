package baitaptugiai4;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Moving Balls");
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setResizable(false);
	     frame.add(new MovingBalls());
	     frame.pack();
	     frame.setLocationRelativeTo(null);
	     frame.setVisible(true);
	}

}
