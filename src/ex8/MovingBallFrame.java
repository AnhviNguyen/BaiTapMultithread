package ex8;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MovingBallFrame extends JFrame{

	public static void main(String[] args) {
		MovingBallFrame frame = new MovingBallFrame();
		frame.setSize(300, 300);
        frame.setTitle("Moving Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MovingBall light = new MovingBall();
        frame.add(light);
        light.init();
        frame.setVisible(true);

	}
}
