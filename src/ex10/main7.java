package ex10;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main7 extends JFrame implements ActionListener,Runnable{
	
	JButton create = new JButton("new clock");
	
	JLabel clock = new JLabel();
	
	Thread t;
	
	public void MultiClock() {
		Container cont = this.getContentPane();
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		clock = new JLabel(sdf.format(cal.getTime()), JLabel.CENTER);
		clock.setFont(new Font(clock.getFont().getName(), Font.PLAIN, 40));
		clock.setForeground(Color.RED);
		
		cont.add(create, "North");
		
		cont.add(clock);
		this.pack();
		this.setVisible(true);
		
		create.addActionListener(this);
		
		Thread t = new Thread(this);
		t.start();
	}
	
	public void tick() {
		try {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			
			clock.setText((sdf.format(cal.getTime())));
			
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread t = new Thread(new main7());
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			tick();
		}
		
	}
	
	public static void main(String[] args) {
		main7 clock = new main7();
		clock.MultiClock();
	}
	
	
}
