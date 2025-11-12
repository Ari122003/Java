package Multithreading;

class MonitorLock{

    synchronized void task1(){
        try{
            System.out.println("Inside task1");
            Thread.sleep(10000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    void task2(){
        System.out.println("Inside task2 but before synchronization");

        synchronized(this){
            System.out.println("Inside task2");
        }
    }

    void task3(){
        System.out.println("Inside task3");
    }
}

public class Monitor_Lock {
    public static void main(String[] args) {
        MonitorLock lock = new MonitorLock();
        Thread t1 = new Thread(() -> lock.task1());
        Thread t2 = new Thread(() -> lock.task2());
        Thread t3 = new Thread(() -> lock.task3());

        t1.start();
        t2.start();
        t3.start();
    }
}

