package factory;

import lombok.ToString;

/**
 * Created by Evegeny on 08/12/2016.
 */
@ToString
public class Hobbit {
    @InjectRandomInt(min = 10, max = 18)
    private int dexterity;
}
