package baitaptugiai2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MultithreadingProgram extends JPanel implements Runnable {
	    private static final int WINDOW_WIDTH = 800;
	    private static final int WINDOW_HEIGHT = 100;

	    private String text = "Multithreading programming";
	    private int x = 0;
	    private int dx = 5;

	    public MultithreadingProgram() {
	        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
	        Thread thread = new Thread(this);
	        thread.start();
	    }

	    @Override
	    public void run() {
	        while (true) {
	            x += dx;
	            if (x <= 0 || x + text.length() >= WINDOW_WIDTH) {
	                dx = -dx;
	            }
	            repaint();
	            try {
	                TimeUnit.MILLISECONDS.sleep(20);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);

	        g.drawString(text, x, 50);
	    }
}
