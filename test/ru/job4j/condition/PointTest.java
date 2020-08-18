package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.DoubleToIntFunction;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenx1Oney1x2y2Two() {
   
    double expected = 1;
    double out = Point.distance(1, 2, 2, 2);
    Assert.assertEquals(expected, out,0.1);
    }
}