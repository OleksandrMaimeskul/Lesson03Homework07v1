import java.util.Arrays;
import java.util.Random;

public class Lesson03Homework07v1 {
    public class HomeworkRefresh {

        public static final int PLAYERS = 5;

        public static void main(String[] args) {
//        teamA
            Random random = new Random();
            int[] player = new int[5];
            int sum = 0;
            for (int i = 0; i < PLAYERS; i++) {
                player[i] = random.nextInt(10 + 1) + 1;
                i++;
            }
            for (int i = 0; i < player.length; i++) {
                sum += player[i];
            }
            System.out.println(Arrays.toString(player));
            System.out.println("Average score of frags for team A is " + sum / PLAYERS);

            //        teamB
            for (int i = 0; i < PLAYERS; i++) {
                player[i] = random.nextInt(10 + 1) + 1;
                i++;
            }
            for (int i = 0; i < player.length; i++) {
                sum += player[i];
            }
            System.out.println(Arrays.toString(player));
            System.out.println("Average score of frags for team B is " + sum / PLAYERS);
        }
    }
}
