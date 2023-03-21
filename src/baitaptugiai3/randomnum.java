package baitaptugiai3;

import java.util.Random;

public class randomnum extends Thread{
	private int randomnum;

	public randomnum(int randomnum) {
		this.randomnum = randomnum;
	}
	
	public randomnum() {
		
	}

	public int getRandomnum() {
		return randomnum;
	}

	public void setRandomnum(int randomnum) {
		this.randomnum = randomnum;
	}
	
	public void run() {
		Random rand = new Random();
		randomnum = rand.nextInt(30) + 1;
		System.out.println("random numbers is: "+ randomnum);
	}	
}
