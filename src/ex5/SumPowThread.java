package ex5;

public class SumPowThread extends Thread{
	long s=0;
	int x, n;
	
	public SumPowThread(int x, int n) {
		this.x = x;
		this.n = n;
	}
	
	public void run() {
		for (int i=0; i<=n; i++) {
			s+=Math.pow(x, i);
		}
		System.out.println("f3= "+ s);
	}
	
	public long getResult() {
		return s;
	}
	
	
}
