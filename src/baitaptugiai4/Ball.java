package baitaptugiai4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Ball {
	private Point position;
    private Point velocity;
    private int radius;
    private Color color;

    public Ball(int x, int y, int dx, int dy, int radius, Color color) {
        position = new Point(x, y);
        velocity = new Point(dx, dy);
        this.radius = radius;
        this.color = color;
    }

    public void bounce(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	public void move() {
        position.translate(velocity.x, velocity.y);
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x - radius, position.y - radius, radius * 2, radius * 2);
    }
}
