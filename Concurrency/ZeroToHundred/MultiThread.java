package Concurrency.ZeroToHundred;

public class MultiThread implements Runnable{
    int num;
    public MultiThread(int i) {
        this.num = i;
    }
    @Override
    public void run(){
        System.out.println(num + " Printed by : "+Thread.currentThread().getName());
    }
}
