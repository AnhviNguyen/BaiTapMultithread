package threading_eng_ex4;

import java.util.Random;

public class NumberGuesserThread extends Thread {
	private final String threadName;
    private final int targetNumber;
    private final Random random = new Random();
    private static final int MAX_NUMBER = 100;
    private static final int MAX_GUESSES = 10;

    public NumberGuesserThread(String threadName, int targetNumber) {
        this.threadName = threadName;
        this.targetNumber = targetNumber;
    }

    public void run() {
        int numGuesses = 0;
        while (true) {
            int guess = random.nextInt(MAX_NUMBER) + 1;
            System.out.println(threadName + " guessed: " + guess);
            numGuesses++;

            if (guess == targetNumber) {
                System.out.println(threadName + " wins! It took " + numGuesses + " guesses.");
                break;
            }

            if (numGuesses >= MAX_GUESSES) {
                System.out.println(threadName + " ran out of guesses.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
