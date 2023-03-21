package ex4;

import java.awt.Frame;
import java.awt.TextArea;

import ex3.HighThread;
import ex3.LowThread;
import ex3.textArea;

public class PriorityDemo1 extends Frame{
	private HighThread high;
	private LowThread low;
	
	private TextArea output;
	
	public PriorityDemo1() {
		super("PriorityDemo");
		output = new TextArea(10, 20);
		add(output);
		setSize(250, 200);
		setVisible(true);
		
		high = new HighThread(output);
		high.start();
		
		low = new LowThread(output);
		low.start();
		
	}	
}
