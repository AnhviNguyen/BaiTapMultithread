package baitaptugiai2;

import javax.swing.JFrame;

public class main{
		public static void main(String[] args)  {
			JFrame frame = new JFrame("Multithreading Program");
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     frame.add(new MultithreadingProgram());
		     frame.pack();
		     frame.setLocationRelativeTo(null);
		     frame.setVisible(true);
	}
}