package neveruseswitch;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Evegeny on 08/12/2016.
 */
@Component
@Scope("singleton")
public class DBUtils {


    public DBUtils() {
        System.out.println("DBUTILS WAS CREATED");
    }

    public int getMailCode() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public void saveNewMailInfo() {
        System.out.println("new mail was added");
    }
}
