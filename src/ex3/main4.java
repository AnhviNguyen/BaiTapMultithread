package ex3;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main4 {

	public static void main(String[] args) {
		priorityDemo app = new priorityDemo();
		
		app.addWindowListener(
			new WindowAdapter() {
				public void windowClosing (WindowEvent e) {
					System.exit(0);
				}
			}
		);
	}

}
