package baitaptugiai3;

public class main {

	public static void main(String[] args) {
		randomnum[] list = new randomnum[7];
		
		// bắt đầu chạy chương trình cho từng thread
		for (int i=0; i<list.length; i++) {
			list[i] = new randomnum();
			list[i].start();
		}
		
		int sum=0;
		// cho chương trình chạy hết các threads
		try {
			for (randomnum num : list) {
				sum += num.getRandomnum();
				num.join();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("tong cua cac so la: "+sum);

	}

}
