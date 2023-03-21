package threading_eng_ex2;

class NumberPrinterThread extends Thread{
	private final Object lock;

    public NumberPrinterThread(String name, Object lock) {
        super();
        this.lock = lock;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (lock) { // acquire the lock
                System.out.println(this.getName() + ": " + i);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

