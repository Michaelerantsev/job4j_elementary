package ru.job4j.calcullate;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

        public class X2Test {

            @Test
            public void whenBCZero() {
                int a = 0;
                int b = 1;
                int c = 1;
                int x = 1;
                int expected = 2;
                int rsl  = X2.calc(a, b, c, x);
                assertThat(rsl, is(expected));

            }
        }
