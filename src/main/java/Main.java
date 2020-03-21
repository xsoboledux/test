public class Main {
    public static void main(String[] args) {
        int integer = 9;
        double doub = 10.8;
        char ch = 'd';
        boolean f = true;
        float c = 15;

        TestThread testThread = new TestThread();

        testThread.start();

        TestRunnable testRunnable = new TestRunnable();

        testRunnable.run();
    }

    static class  TestThread extends Thread {

    }

    static class  TestRunnable implements  Runnable {

        @Override
        public void run() {

        }
    }
}
