package threading_eng_ex2;

public class main {

	public static void main(String[] args) {
		final Object lock = new Object(); // shared object lock
        Thread t1 = new NumberPrinterThread("T1", lock);
        Thread t2 = new NumberPrinterThread("T2", lock);
        Thread t3 = new NumberPrinterThread("T3", lock);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        // Start threads
        t1.start();
        t2.start();
        t3.start();
	}

}
