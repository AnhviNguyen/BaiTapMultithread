package ex6;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class main5 extends JFrame implements Runnable {
	
	private Date today  = new Date();
	private Thread th = null;
	private JFrame fr;
	
	public void start() {
		if (th==null) {
			th = new Thread(this);
			th.start();
		}
	}
	
	@Override
	public void run() {
		while (true) {
			fr= new JFrame();
			fr.setTitle("World time");
			fr.setSize(400, 300);
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fr.setVisible(true);
			
			today = new Date();
			
			paint();
			
			fr.setLayout(null);
			try {
				
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void paint(){
		JLabel label1 = new JLabel("Tel-Aviv : "+today);
		label1.setBounds(50, 50, 200, 30);
		fr.add(label1);
		today.setTime(today.getTime()-7*3600*1000);
		JLabel label2 = new JLabel("New-York: "+today);
		fr.add(label2);
		label2.setBounds(50, 100, 200, 30);
		today.setTime(today.getTime()+7*3600*1000);
		JLabel label3 = new JLabel("Hanoi: "+today);
		fr.add(label3);
		label3.setBounds(50, 150, 200, 30);
	}
	
	public static void main(String[] args) {
		main5 ma = new main5();
		ma.start();
	}
}
		
		
		

