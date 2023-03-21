package ex5;

public class MultiThreadDemo {
	FacThread t1 = new FacThread(2);
	SumThread t2 = new SumThread(3);
	SumPowThread t3 = new SumPowThread(2, 1);
	
	public MultiThreadDemo() {
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
			long s = t1.getResult()+t2.getResult()+t3.getResult();
			
			System.out.println("ket qua = "+s);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}			
	}
	
	public static void main(String[] args) {
		new MultiThreadDemo();
	}
}


