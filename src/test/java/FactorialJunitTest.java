import Factorial.Factorial;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FactorialJunitTest {

    @Test
    void forZeroTest(){
        assertEquals(1, Factorial.getFactorial(0));

    }

    @Test
    void positiveTest(){
        assertEquals(1, Factorial.getFactorial(1));
        assertEquals(2, Factorial.getFactorial(2));
        assertEquals(6, Factorial.getFactorial(3));
    }

    @Test
    void negativeTest(){
        assertEquals(1,Factorial.getFactorial(-1));
    }
}
