import java.util.Random;
import java.util.Scanner;

public class Randomtwo {
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
                        Randomtwo r = new Randomtwo();
                        System.out.print("The random number is as follows:");
                        System.out.println(r.randomise(max,min));
        }
}
