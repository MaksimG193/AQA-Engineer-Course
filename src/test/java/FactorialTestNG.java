import Factorial.Factorial;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTestNG {

    @Test(description = "Test for zero")

    void testForZero(){
        assertEquals(1,Factorial.getFactorial(0));
    }

    @Test(description = "Positive test")

    void positiveTest(){
        assertEquals(6, Factorial.getFactorial(3));
        assertEquals(120, Factorial.getFactorial(5));
    }

    @Test(description = "Negative test")

    void negativeTest(){
        assertEquals(1,Factorial.getFactorial(-1));
    }

}
