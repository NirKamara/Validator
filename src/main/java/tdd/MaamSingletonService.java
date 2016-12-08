package tdd;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class MaamSingletonService {
    private static MaamSingletonService ourInstance = new MaamSingletonService();

    public static MaamSingletonService getInstance() {
        return ourInstance;
    }

    private MaamSingletonService() {
    }


    public double getMaam() {

        return 0.17;
    }
}
