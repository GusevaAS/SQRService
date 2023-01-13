package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {
    @Test
    public void testCalcFoundSquareInSpan () {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testCalcNotFoundSquareInSpan () {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(10, 15);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalcMinAndMaxEquals () {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(150, 150);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcWhenMinHigherThenMax () {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(200, 100);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalcWhenSquareHigherThenMax () {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(10_000, 11_000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalcWhenMinNegativeValue () {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(-100, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}