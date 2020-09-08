package ru.job4j.convert;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConert280RblThen4Euro() {
        int in = 280;
        int expected = 4;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }


    @Test
    public void whenConvert180RblThen3Dollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}