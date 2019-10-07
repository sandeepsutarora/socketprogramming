package com.sutar.innovation.corejavafaq;

public class TestRunnable implements Runnable{

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new TestRunnable());
        t1.start();
        System.out.print("Started");
        t1.join();
        System.out.print("Completed");
    }

    public void run()
    {
        for(int i =0;i<4;i++)
        {
            System.out.print(i);
        }
    }
}


