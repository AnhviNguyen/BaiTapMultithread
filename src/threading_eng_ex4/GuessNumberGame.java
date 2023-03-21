package threading_eng_ex4;

import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Guess the Number game!");
        System.out.println("Please enter a number between 1 and 100:");

        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();

        System.out.println("You have entered: " + targetNumber);
        System.out.println("Let's see which thread can guess your number first!");

        Thread thread1 = new NumberGuesserThread("Thread 1", targetNumber);
        Thread thread2 = new NumberGuesserThread("Thread 2", targetNumber);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
