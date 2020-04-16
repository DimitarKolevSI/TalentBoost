public class StartingThreads {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnableObj = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is working...");
            }
        };
        Thread thread1 = new Thread(runnableObj);
        //thread1.setDaemon(false); подразбира се
        thread1.setName("My fancy thread");
        thread1.start();
        thread1.join();
        System.out.println(Thread.currentThread().getName() + " finished work.");
    }
}
