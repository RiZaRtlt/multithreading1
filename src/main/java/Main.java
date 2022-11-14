public class Main extends Thread{
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        Runnable runnable = () -> new MyThread().run();

        ThreadGroup mainGroup = new ThreadGroup("My group");

        Thread thread1 = new Thread(mainGroup, runnable, "Поток 1");

        Thread thread2 = new Thread(mainGroup, runnable, "Поток 2");

        Thread thread3 = new Thread(mainGroup, runnable, "Поток 3");

        Thread thread4 = new Thread(mainGroup, runnable, "Поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15000);

        mainGroup.interrupt();
    }
}
