package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void
    เจ็ดบวกสองต้องได้ผลลัพธ์เท่ากับเก้า() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(7, 2);
        assertEquals(9, result);
    }

    @Test
    public void
    สองบวกสองต้องได้ผลลัพธ์เท่ากับสี่() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(2, 2);
        assertEquals(4, result);
    }

}
