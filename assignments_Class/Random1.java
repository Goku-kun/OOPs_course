import java.util.Scanner;
import java.util.Random;
public class Random1 {
        public int randomise(int max, int min) {
                return new Random().nextInt((max-min + 1)) + min;
        }
        public static void main(String[] args) {
                int max, min, k, u;
                Random1 r1 = new Random1();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Upper limit:");
                max = sc.nextInt();
                System.out.println("Enter the lower limit:");
                min = sc.nextInt();
                System.out.println("Enter the user key:");
                u = sc.nextInt();
                k = r1.randomise(max, min);
                System.out.println();
                if(u==k) {
                        System.out.println("Both the numbers are equal.");
                }
                else if(u<k) {
                        System.out.println(u+" is the user number and "+k+" is the random number." +(k-u)+" is the difference.");
                }
                else {
                        System.out.println(u+" is the user number and "+k+" is the random number." +(u-k)+" is the difference.");
                }
        }
}
