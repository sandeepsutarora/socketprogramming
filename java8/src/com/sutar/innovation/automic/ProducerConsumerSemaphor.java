package com.sutar.innovation.automic;

import java.util.concurrent.Semaphore;

class Q
{
    private int n;
    private Semaphore conSemaphor = new Semaphore(0);
    private Semaphore prodSemaphor = new Semaphore(1);
    public void get()
    {

        try {
            conSemaphor.acquire();
        }catch (InterruptedException exc)
        {
            System.out.println(exc);
        }
        System.out.println("Got: "+ n);
        prodSemaphor.release();
    }
    public void put(int n)
    {
        try
        {
            prodSemaphor.acquire();

        }catch (InterruptedException exc)
        {
            System.out.println(exc);
        }
        this.n= n;
        System.out.println("Put: "+ n);
        conSemaphor.release();
    }


}

class Producer implements Runnable
{
    Q q ;
    public Producer(Q q)
    {
        this.q=q;
        new Thread(this).start();
    }
   public void run()
   {
    for(int i =0; i <10;i++)
    {
        q.put(i);
    }
   }
}

class Consumer implements Runnable
{
    Q q ;
    public Consumer(Q q)
    {
        this.q=q;
        new Thread(this).start();
    }
    public void run()
    {
        for(int i =0; i<10;i++)
        {
            q.get();
        }
    }
 }

public class ProducerConsumerSemaphor {

    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }

}
