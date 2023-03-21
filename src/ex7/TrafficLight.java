package ex7;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TrafficLight extends JPanel implements Runnable{

	String light = "green";
	
	public void init() {
		Thread t1 = new Thread(this);
		Thread t2 = new Thread(this);
		Thread t3 = new Thread(this);
		
		t1.setName("red");
		t2.setName("yellow");
		t3.setName("green");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
	
	public void paint(Graphics g) {
		if (light.equals("green")){
			g.setColor(Color.green);
		}
		if (light.equals("yellow")){
			g.setColor(Color.yellow);
		}
		if (light.equals("red")){
			g.setColor(Color.red);
		}
		
		g.fillOval(100, 100, 50, 50);
	}
	
	public void showlight() {
		light = Thread.currentThread().getName();
		
		repaint();
	}

	
	
	@Override
	public void run() {
		while (true) {
			showlight();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}	
}
