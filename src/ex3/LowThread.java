package ex3;

import java.awt.TextArea;

public class LowThread extends Thread{
	private TextArea display;
	
	public LowThread(TextArea output) {
		display = output;
		setPriority(Thread.MIN_PRIORITY);
	}
	
	public void run() {
		for (int i=1; i<=5; i++) {
			display.append("Low Priority Thread!!!! \n");
		}
	}	
}
