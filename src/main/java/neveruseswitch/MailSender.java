package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 08/12/2016.
 */
@Component
@EnableScheduling
    public class MailSender {

    @Autowired
    private Map<String,MailGenerator> map;

    @Autowired
    private DBUtils dbUtils;

    @Scheduled(cron = "1/2 * * * * ?")
    public void sendMail() {
        String mailCode = String.valueOf(dbUtils.getMailCode());
        MailGenerator mailGenerator = map.get(mailCode);

        if (mailGenerator == null) {
            throw new RuntimeException("mailcode " + mailCode + " not supported yet");
        }
        String html = mailGenerator.generateHtml();
        send(html);
    }

    private void send(String html) {
        System.out.println("sending... " + html);
    }
}







