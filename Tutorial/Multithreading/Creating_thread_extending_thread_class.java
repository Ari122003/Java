package Multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread is running");
    }
}

public class Creating_thread_extending_thread_class {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

