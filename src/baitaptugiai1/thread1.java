package baitaptugiai1;

import java.util.Scanner;

public class thread1 extends Thread{
	Scanner sc = new Scanner(System.in);
	private double dai, rong;
	
	public thread1(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}

	public thread1() {
		super();
	}

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public void run() {
		System.out.println("nhap chieu dai: ");
		double d = sc.nextDouble();
		this.setDai(d);
		System.out.println("nhap chieu rong: ");
		double r = sc.nextDouble();
		this.setRong(r);
	}
}
