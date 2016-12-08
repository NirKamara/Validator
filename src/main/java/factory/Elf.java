package factory;

import lombok.ToString;

import java.util.Random;

/**
 * Created by Evegeny on 08/12/2016.
 */
@ToString
public class Elf {
    @InjectRandomInt(min = 50, max = 100)
    private int power;
    @InjectRandomInt(min = 30, max = 40)
    private int speed;

    private int life;


}
