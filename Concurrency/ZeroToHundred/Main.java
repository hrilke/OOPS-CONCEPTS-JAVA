package Concurrency.ZeroToHundred;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            MultiThread multiThread = new MultiThread(i);
            Thread thread = new Thread(multiThread);
            thread.start();
        }
    }
}
