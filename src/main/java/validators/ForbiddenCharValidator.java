package validators;

import org.springframework.stereotype.Component;

/**
 * Created by student14 on 08/12/2016.
 */
@Component
public class ForbiddenCharValidator implements Validator {
    @Override
    public void validate(String line) {
        if (line.contains("*") || line.contains("#")) {
            System.out.println("forbidden sign found");
        }
    }
}
