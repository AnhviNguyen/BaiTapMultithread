package baitaptugiai1;

public class thread3 extends Thread{
	double c=0;
	private thread1 t1;
	
	public thread3(thread1 t1) {
		this.t1 = t1;
	}

	public double tinhchuvi() {	
		return (t1.getRong()+t1.getDai())*2;
	}
	
	public void run(){
		c = tinhchuvi();
		System.out.println("chu vi la: "+c);
	}
}
