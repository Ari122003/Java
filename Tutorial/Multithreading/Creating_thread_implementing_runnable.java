package Multithreading;

class MyClass implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World");
        System.out.println(Thread.currentThread().getName());
    }
}

public class Creating_thread_implementing_runnable {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        Thread t1 = new Thread(obj);

        t1.start();

        System.out.println(Thread.currentThread().getName());
    }
}
