package com.sutar.innovation.automic;

import javafx.animation.Interpolatable;

import java.util.concurrent.*;

public class SemaphorDemo {

    public static void main(String[] args) throws Exception{
    Semaphore sem = new Semaphore(1);

    new incThread("inc",sem);
    new decThread("dec",sem);


    }

}

class Shared {static int count = 0;}

class incThread implements Runnable{

    private String name;
    private Semaphore semaphore;

    public incThread(String name, Semaphore s)
    {
        this.name = name;
        this.semaphore = s;
        new Thread(this).start();
    }

    public void run(){

        System.out.println("Starting "+name);
        try
        {
            System.out.println("Thread "+name +" is waiting for a permit");
            this.semaphore.acquire();
            System.out.println(name+" gets a permit");

            for(int i =0; i < 5; i++)
            {
                Shared.count++;
                System.out.println(name + " : "+Shared.count);
                Thread.sleep(100 );
            }
        }catch (InterruptedException exception)
        {
            System.out.println(exception);
        }
        this.semaphore.release();
    }
}

class decThread implements Runnable{
    private String name;
    private Semaphore semaphore;

    public decThread(String name, Semaphore sem)
    {
        this.name = name;
        this.semaphore = sem;
        new Thread(this).start();
    }

    public void run(){

        try {
            semaphore.acquire();
            System.out.println("Name: "+name+" is waiting for a permit" );
            for(int i = 0; i < 5; i++)
            {
                Shared.count--;
                System.out.println(name + " : "+Shared.count);
                Thread.sleep(100 );

            }
        }
        catch (InterruptedException exceptio)
        {

        }
        semaphore.release();
    }

}


