import java.util.*;

public class Random169 {
        public int randomise(int max, int min) {
                return new Random().nextInt((max-min + 1)) + min;
        }
        public static void main(String[] args) {
                        Random random = new Random();
                        Scanner sc = new Scanner(System.in);
                        int max = 170, min =160, ran=0, i=0;
                        Random169 r = new Random169();
                        while(i == 0) {
                                if(ran == 169) {
                                        System.out.println("We have our random number as 169.");
                                        i=1;
                                }
                                else {
                                        i = 0;
                                        System.out.print("The random number is as follows:");
                                        ran = r.randomise(max,min);
                                        System.out.println(ran);
                                        try {
                                                Thread.sleep(1000);
                                        }
                                        catch(Exception ex) {
                                                System.out.println("Exception Exception");
                                        }
                                }
                        }
        }
}
