package game;

import javax.swing.*;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class GuessGameManager {
    private PlayService playService = new PlayService();
    private ScoreService scoreService = new ScoreService();
    private RegistrationManager registrationManager;

    public void play(){
        boolean cont = true;
        while (true) {
            int userChoice = Integer.parseInt(JOptionPane.showInputDialog("what is your choice? 1 - new game, 2 - print my score, 3 print all best score, 4 exit"));
            if (userChoice == 1) {
                Player player = registrationManager.getPlayer();
                int max = Integer.parseInt(JOptionPane.showInputDialog("what is your max?"));
                playService.startNewGame(player,max);


            }
            if (userChoice == 3) {
                scoreService.printAllBestScore();
            }
            if (userChoice == 4) {
                System.exit(0);
            }        }
    }


}
