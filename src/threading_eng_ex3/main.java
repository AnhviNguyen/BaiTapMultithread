package threading_eng_ex3;

public class main {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
            // Code to be executed in thread 1
        });
        Thread t2 = new Thread(() -> {
            // Code to be executed in thread 2
        });
        t1.start();
        t2.start();
        System.out.println("Thread 1 name: " + t1.getName());
        System.out.println("Thread 2 name: " + t2.getName());

	}

}
