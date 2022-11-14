public class MyThread extends Thread implements Runnable {


    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я " + Thread.currentThread().getName() + ". Всем привет!");
            }
        }catch (InterruptedException err) {

            } finally{
                System.out.printf("%s завершен\n", Thread.currentThread().getName());
            }

    }

}
