package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 08/12/2016.
 */
@Component("3")
public class MailGenerator888 implements MailGenerator {
    @Override
    public String generateHtml() {
        return "88888888888888888888888888888888";
    }
}
