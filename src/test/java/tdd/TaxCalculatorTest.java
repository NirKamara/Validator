package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class TaxCalculatorTest {
    @Test
    public void withMaam() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculator();
        MaamService maamServiceMock = Mockito.mock(MaamService.class);
        Mockito.when(maamServiceMock.getMaam()).thenReturn(0.17);
        taxCalculator.setMaamService(maamServiceMock);


        double result = taxCalculator.withMaam(100);
        Assert.assertEquals(117,result,0.00001);

    }

}