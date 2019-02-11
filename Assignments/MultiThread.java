public class MultiThread {
        public static void main(String[] args) {
                Threader t1 = new Threader();
                Threader t2 = new Threader();
                t1.start();
                t2.start();
        }
}

class Threader extends Thread {
        @Override
        public void run() {
                for (int i = 0;i < 10;i++) {
                        System.out.println(i);
                        try {
                                Thread.sleep(1000);
                        } catch(Exception e) {
                                System.out.println(e.getMessage());
                        }
                }
        }
}
