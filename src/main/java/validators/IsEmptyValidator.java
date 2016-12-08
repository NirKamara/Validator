package validators;

import org.springframework.stereotype.Component;

/**
 * Created by student14 on 08/12/2016.
 */
@Component
public class IsEmptyValidator implements Validator {
    @Override
    public void validate(String line) {
        if (line.isEmpty()) {
            System.out.println("line is empty");
        }
    }
}