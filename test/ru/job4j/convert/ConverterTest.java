package ru.job4j.convert;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in= 280;
        int expected= 4;
        int out= Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
}