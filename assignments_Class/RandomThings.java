import java.util.Random;

public class RandomThings {
        public static void main(String[] args) {
                Random random = new Random();
                for (int i = 0;i < 10;i++) {
                        System.out.println(random.nextInt());
                        try {
                                Thread.sleep(random.nextInt(5000));
                        } catch(Exception ex) {
                                System.out.println("YO");
                        }
                }
        }
}
