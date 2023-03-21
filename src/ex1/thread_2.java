package ex1;

public class thread_2 extends Thread{
	public void run () {
		for (int i=2; i<=10; i++) {
			if (i%2 ==0) {
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
