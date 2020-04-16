import java.io.File;

public class FileCounter{

    static long count = 0;

    private static void getFile(String dirPath) {
        File f = new File(dirPath);
        File[] files = f.listFiles();

        if (files != null)
            for (int i = 0; i < files.length; i++) {
                count++;
                File file = files[i];

                if (file.isDirectory()) {
                    //System.out.println(file.getAbsolutePath());
                    getFile(file.getAbsolutePath());
                }
            }
    }

    static Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            count = 0;
            getFile("C:\\Users\\Димитър\\Desktop");
            System.out.println("No. Of Files in C:\\Users\\Димитър\\Desktop "+count);
            long endTime = System.currentTimeMillis();
            long duration = (endTime - startTime);
            System.out.println("And the duration is " + duration/1000 + " seconds");
        }
    });
    static Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            count = 0;
            getFile("C:\\Users");
            System.out.println("No. Of Files in Users: "+count);
            long endTime = System.currentTimeMillis();
            long duration = (endTime - startTime);
            System.out.println("And the duration is " + duration/1000 + " seconds");

        }
    });

    public static void run() throws InterruptedException {
        thread1.run();
        thread2.run();
        thread1.join();
        thread2.join();
    }

    public static void main(String args[]) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        run();
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("And the duration of all is " + duration/1000 + " seconds");
    }

}