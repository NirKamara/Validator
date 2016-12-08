package validators;

import neveruseswitch.MailGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Evegeny on 08/12/2016.
 */
@Component
public class ValidatorService {

    @Autowired
    private List<Validator> validatorList;

    public void validateLine(String line) {
        for (Validator validator : validatorList) {
            validator.validate(line);
        }
    }
}















  /*public List<String> findErrorsPerLine(String line) {
        ArrayList<String> errors = new ArrayList<>();
        if (line.isEmpty()) {
            errors.add("line is empty");
        }
        if (line.contains("*") || line.contains("#")) {
            errors.add("forbidden sign found");
        }

        return errors;
*/
