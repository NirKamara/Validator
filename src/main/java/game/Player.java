package game;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class Player {
    @Getter
    private String name;
    @Getter
    private List<Double> scores = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }


    public void addScore(double score) {
        scores.add(score);
        scores.sort((d1,d2)->d2.compareTo(d1));
    }

    public Double bestScore(){
        return scores.get(0);
    }













}
