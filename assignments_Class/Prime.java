import java.util.Scanner;
public class Prime {
        public void checkPrime(int num) {
                int cnt=0;
                for(int i=1 ; i<=num; i++) {
                        if(num%i == 0) {
                                cnt++;
                        }
                }
                if(cnt == 2) {
                        System.out.println(num+" is a prime number.");
                }
                else if(num == 1) {
                        System.out.println("1 is a special number.");
                }
                else {
                        System.out.println(num+" is a composite number.");
                }
        }
        public static void main(String[] args) {
                Prime p = new Prime();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number to check if it's prime.");
                int num=sc.nextInt();
                p.checkPrime(num);
        }
}
