package ex3;

import java.awt.TextArea;

public class HighThread extends Thread{
	private TextArea display;
	
	public HighThread(TextArea output) {
		display = output;
		setPriority(Thread.MIN_PRIORITY);
	}

	public void run() {
		for (int i=1; i<=5; i++) {
			display.append("Hight Priority Thread!!!! \n");
		}
	}	
}
