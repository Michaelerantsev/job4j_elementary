package ru.job4j.calcullate;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

        public class X2Test {

            @Test
            public void whenABCXOne() {

                assertThat(X2.calc(1, 1, 1, 1), is(3));

            }

            public void whenBCXZeroAOne() {
                assertThat(X2.calc(0, 1, 1, 1), is(2));
            }

            public void whenBZeroACXOne() {
                assertThat(X2.calc(1, 0, 1, 1), is(2));
            }

            public void whenCZeroABXOne() {
                assertThat(X2.calc(1, 1, 0, 1), is(2));
            }

            public void whenXZero() {
                assertThat(X2.calc(1, 1, 1, 0), is(1));
            }
        }