package validators;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student14 on 08/12/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext validators = new AnnotationConfigApplicationContext("validators");
        ValidatorService validatorService = validators.getBean(ValidatorService.class);
        String line = "dfsdf";

        validatorService.validateLine(line);

    }
}
