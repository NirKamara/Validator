package game;

import java.util.Comparator;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class DoubleComparartor implements Comparator<Double> {
    @Override
    public int compare(Double o1, Double o2) {
       return o1.compareTo(o2);
    }
}
