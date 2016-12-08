package game;

import javax.swing.*;
import java.util.Random;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class PlayService {
    private Random random = new Random();
    private ScoreService scoreService;

    public void startNewGame(Player player, int max) {
        double score;
        int retries = 0;
        int userGuess = -1;
        int randomInt = random.nextInt(max);
        while (userGuess != randomInt) {
            userGuess = Integer.parseInt(JOptionPane.showInputDialog("what is your number?"));
            if (userGuess < randomInt) {
                JOptionPane.showMessageDialog(null, "too small");
            }
            if (userGuess > randomInt) {
                JOptionPane.showMessageDialog(null, "too big");
            }
            retries++;
        }

        JOptionPane.showMessageDialog(null, "You won!!!");
        scoreService.printPlayerScore(player.getName());


        score = max / retries;
        player.addScore(score);

    }


}
