import java.util.Random;
import java.util.Scanner;

public class Random2 {
        public int randomise(int max, int min) {
                return new Random().nextInt((max-min + 1)) + min;
        }
        public static void main(String[] args) {
                Random random = new Random();
                Scanner sc = new Scanner(System.in);
                int max,min;
                System.out.println("Enter the upper limit:");
                max = sc.nextInt();
                System.out.println("Enter the lower limit:");
                min = sc.nextInt();
                Random2 r1 = new Random2();
                for (int i = 0;i < 10;i++) {
                        System.out.println(r1.randomise(max, min));
                        try {
                                Thread.sleep(random.nextInt(5000));
                        } catch(Exception ex) {
                                System.out.println("YO");
                        }
                }
        }
}
