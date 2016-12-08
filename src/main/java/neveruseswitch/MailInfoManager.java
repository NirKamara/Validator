package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 08/12/2016.
 */
@Component
public class MailInfoManager {
    @Autowired
    private DBUtils dbUtils;


    @Autowired
    private DBUtils dbUtils2;

    @Scheduled(cron = "1/3 * * * * ?")
    public void doWork(){
        System.out.println("working hard...");
        dbUtils.saveNewMailInfo();
    }

}
