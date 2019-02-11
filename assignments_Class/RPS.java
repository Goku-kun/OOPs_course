import java.util.Scanner;
import java.util.Random;
public class RPS {
        private static int i;
        RPS() {
                System.out.println("Welcome to the Rock, Paper and Scissors game.");
                System.out.println("Here, 0 represents Rock, 1 represents Scissors, 2 represents Paper");
                i=1;
        }
        public int randomise(int max, int min) {
                return new Random().nextInt((max-min + 1)) + min;
        }
        public void game_Play(int player, int computer) {
                int temp;
                Scanner sc = new Scanner(System.in);
                if(player == computer) {
                        System.out.println("It's a Draw.");
                }
                else if((player == 0 && computer == 1) || (player == 1 && computer == 2) || (player == 2 && computer == 0) ) {
                        System.out.println("You win!");
                }
                else if (player > 2 || player < 0) {
                        System.out.println("Wrong choice.");
                }
                else {
                        System.out.println("You lose. Better luck next time.");
                }
                System.out.println("Press 1 to play again and 0 to exit.");
                temp = sc.nextInt();
                i = temp;

        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                RPS obj = new RPS();
                int player,computer;
                while(i != 0) {
                        System.out.println("Enter your choice:");
                        player = sc.nextInt();
                        computer = obj.randomise(2, 0);
                        obj.game_Play(player, computer);


                }
        }
}
