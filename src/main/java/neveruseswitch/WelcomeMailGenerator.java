package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 08/12/2016.
 */
@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        // 40 lines of code
        return "WELCOME";
    }
}
