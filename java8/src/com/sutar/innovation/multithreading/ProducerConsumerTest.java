package com.sutar.innovation.multithreading;

class ProducerConsumer{
    private int count = 0;
    public synchronized void producer(){
        ++count;
        System.out.println("After Producer: "+ count);
        notifyAll();
    }
    public synchronized void consumer(){
        while(count == 0)
        {
            try {
                wait();
            }catch(InterruptedException e){}
        }
        System.out.println("Consumed Value: "+ --count);
    }
}

public class ProducerConsumerTest implements  Runnable{
    ProducerConsumer cp;//Shared object
    boolean isProucer;
    public ProducerConsumerTest(){}
    public ProducerConsumerTest(boolean isConsumer, ProducerConsumer cp){
        this.cp=cp;
        this.isProucer=isConsumer;
    }

    public static void main(String[] args) {
        ProducerConsumer cp = new ProducerConsumer();
        Thread producerThread = new Thread(new ProducerConsumerTest(false,cp));
        Thread consumerThread = new Thread(new ProducerConsumerTest(true,cp));
        producerThread.start();
        consumerThread.start();
    }

    @Override
    public void run(){
    for(int i=0;i<10;i++)
    {

        cp.producer();
        cp.consumer();

    }
    }
}

