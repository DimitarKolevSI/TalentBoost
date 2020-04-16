public class CreatingThreads {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        Runnable runnableObj = new Runnable() {
            @Override
            public void run() {
                //Code to execute
            }
        };
        Thread thread1 = new Thread(runnableObj);
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                //Code to execute
            }
        };
    }
}
