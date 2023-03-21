package ex5;

public class SumThread extends Thread{
	long s=0;
	int n;
	
	public SumThread(int n) {
		super();
		this.n = n;
	}
	
	public void run() {
		for (int i =1 ; i<=n; i++) {
			s+=i;
		}
		System.out.println("f2 = "+s);
	}
	
	public long getResult() {
		return s;
	}
	
}
