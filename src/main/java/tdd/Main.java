package tdd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("tdd");
        TaxCalculator taxCalculator = context.getBean(TaxCalculator.class);
        double withMaam = taxCalculator.withMaam(100);
        System.out.println("withMaam = " + withMaam);
    }
}
