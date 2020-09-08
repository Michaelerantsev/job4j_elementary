package ru.job4j.ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then() {

       short in = 170;
       double expected = 80.5;
       double out = Fit.manWeight(in);
       Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman180Then() {

        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }
}