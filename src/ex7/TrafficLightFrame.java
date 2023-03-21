package ex7;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TrafficLightFrame extends JFrame{

	public static void main(String[] args) {
		TrafficLightFrame frame = new TrafficLightFrame();
		frame.setSize(300, 300);
        frame.setTitle("Traffic Light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TrafficLight light = new TrafficLight();
        frame.add(light);
        light.init();
        frame.setVisible(true);
	}

}
