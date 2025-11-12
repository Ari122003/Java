package Multithreading;

class SharedResource{

    boolean isAvialable = false;
    public synchronized void addItem(){
        isAvialable = true;
        System.out.println("Item added by" + Thread.currentThread().getName());

        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consumed item by" + Thread.currentThread().getName());

        while(!isAvialable){
            try{
                System.out.println("Thread : "+Thread.currentThread().getName()+"is waiting");
                wait();
            }
            catch(Exception e){}
        }

        System.out.println("Item consumed by"+Thread.currentThread().getName());
        isAvialable = false;

    }


}

class Producer implements Runnable{
    SharedResource sharedResource;

    Producer(SharedResource sharedResource){{
        this.sharedResource = sharedResource;}
    }

    @Override
    public void run() {
        System.out.println("Producer thread started" + Thread.currentThread().getName());

        try{
            Thread.sleep(5000);
        }catch(Exception e){}

        sharedResource.addItem();
    }
}

class Consumer implements Runnable{
    SharedResource sharedResource;
    Consumer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Consumer thread started" + Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}

public class Comsumer_Producer {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producer = new Thread(new Producer(sharedResource));
        Thread consumer = new Thread(new Consumer(sharedResource));

        producer.start();
        consumer.start();

    }
}

