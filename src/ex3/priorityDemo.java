package ex3;
import java.awt.*;
import java.awt.event.*;

public class priorityDemo extends Frame{
	private HighThread hight;
	private LowThread low;
	private TextArea output;
	
	public  priorityDemo() {
		super("priorityDemo");
		
		output = new TextArea(10, 20);
		add(output);
		
		setSize(250, 200);
		setVisible(true);
		
		hight = new HighThread(output);
		hight.start();
		
		low = new LowThread(output);
		low.start();		
		
	}
	
}
