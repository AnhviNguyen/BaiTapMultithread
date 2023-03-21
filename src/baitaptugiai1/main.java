package baitaptugiai1;

public class main {

	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2(t1);
		thread3 t3 = new thread3(t1);
	
		t1.start();		
		try {
			t1.join();
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
		
		try {
			t2.join();
			t3.join();
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
