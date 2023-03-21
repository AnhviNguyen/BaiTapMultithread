package ex1;

public class main1 {

	public static void main(String[] args) {
		thread_1 t1 = new thread_1();
		thread_2 t2 = new thread_2();
		
		t1.start();
		t2.start();
	}
	

}