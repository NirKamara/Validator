package tdd;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 08/12/2016.
 */
@Component("txcalc")
@Setter
public class TaxCalculator {
    @Autowired
    private MaamService maamService;


    public double withMaam(double price) {
        double maam = maamService.getMaam();
        return price * maam+price;
    }


}
