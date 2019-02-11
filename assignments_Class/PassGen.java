import java.util.Random;
public class PassGen {
        public int rand_Num(int min, int max) {
                return new Random().nextInt((max-min + 1)) + min;
        }
        public char rand_Char(int min, int max) {
                return (char) (new Random().nextInt((max-min +1)) + min);
        }
        public static void main(String[] args) {
                Random random = new Random();
                PassGen pg = new PassGen();
                int p1_min = 97, p1_max = 122;
                int p2_min = 0, p2_max = 9;
                int p3_min = 65, p3_max = 90;
                System.out.println("This program generates a random password.");
                 System.out.println(pg.rand_Char(p1_min, p1_max)+""+pg.rand_Num(p2_min, p2_max)+""+pg.rand_Char(p3_min, p3_max)+""+pg.rand_Char(p1_min, p1_max)+""+pg.rand_Num(p2_min, p2_max)+""+pg.rand_Num(p2_min, p2_max));
        }
}
