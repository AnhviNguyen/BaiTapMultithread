package ex2;
	
	class Mythread extends Thread {
		int start;

		public Mythread(int start) {
			this.start = start;
		}
		
		public static synchronized void go(int s) {
			for (int i=s; i<10; i++) {
				System.out.print(i+" ");
				try {
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		public void run() {
			go(start);
		}

	public static void main2(String[] args) {
		Mythread m1 = new Mythread(1);
		Mythread m2 = new Mythread(2);
		
		m1.start();
		m2.start();
	}

}
