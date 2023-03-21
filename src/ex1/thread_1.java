package ex1;

public class thread_1 extends Thread{
	public void run () {
		for (int i=1; i<10; i++) {
			if (i%2 ==1) {
				System.out.print(i+ " ");
			}
		}
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
