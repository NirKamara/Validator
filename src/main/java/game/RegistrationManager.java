package game;

import javax.swing.*;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class RegistrationManager {
    private ScoreService scoreService;
    public Player getPlayer() {
        String name = JOptionPane.showInputDialog("What is your name");
        return scoreService.initPlayer(name);
    }
}
