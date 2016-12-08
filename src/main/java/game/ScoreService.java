package game;

import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class ScoreService {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void printAllBestScore(){
        for (Player player : players) {
            System.out.println(player.getName() + " " + player.bestScore());
        }
    }

    public void printPlayerScore(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                System.out.println(name+" scores are: "+player.getScores());
                break;
            }
        }
    }


    public Player initPlayer(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        Player player = new Player(name);
        players.add(player);
        return player;
    }
}








