package baitaptugiai1;

public class thread2 extends Thread{
	double s=1;
	private thread1 t1;
		
	public thread2(thread1 t1) {
		this.t1 = t1;
	}

	public double tinhdientich() {
		return  t1.getDai()*t1.getRong();
	}
	
	public void run() {
		s = tinhdientich();
		System.out.println("dien tich la: "+s);
	}
}
