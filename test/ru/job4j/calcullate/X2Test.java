package ru.job4j.calcullate;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

        public class X2Test {

            @Test
            public void whenABCXOne() {
                int a = 1;
                int b = 1;
                int c = 1;
                int x = 1;
                int expected = 3;
                int rsl = X2.calc(a, b, c, x);
                assertThat(rsl, is(expected));

            }

            public void whenAZeroBCXOne() {
                int a = 0;
                int b = 1;
                int c = 1;
                int x = 1;
                int expected = 2;
                int rsl = X2.calc(a, b, c, x);
                assertThat(rsl, is(expected));
            }

            public void whenCZeroABXOne() {
                int a = 1;
                int b = 1;
                int c = 0;
                int x = 1;
                int expected = 2;
                int rsl = X2.calc(a, b, c, x);
                assertThat(rsl, is(expected));
            }

            public void whenXZeroABOne() {
                int a = 1;
                int b = 1;
                int c = 1;
                int x = 0;
                int expected = 1;
                int rsl = X2.calc(a, b, c, x);
                assertThat(rsl, is(expected));
            }
        }