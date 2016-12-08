package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 08/12/2016.
 */
@Component("2")
public class EmailcallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        // 75 lines of code
        return "don't call us we call you";
    }
}
