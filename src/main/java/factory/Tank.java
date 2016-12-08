package factory;

import lombok.ToString;

import java.util.Random;

/**
 * Created by Evegeny on 08/12/2016.
 */
@ToString
public class Tank {
    @InjectRandomInt(min = 1000, max = 1500)
    private int stamina;

}
