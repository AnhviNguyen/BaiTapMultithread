package ex5;

public class FacThread extends Thread{
	long gt =1;
	int n;
	
	public FacThread(int n) {
		this.n = n;
	}
	
	public void run() {
		for (int i=2; i<=n; i++) {
			gt *=i;
		}
		System.out.println("F1 = "+ gt);
	}
	
	public long getResult() {
		return gt;
	}
	
	
}
