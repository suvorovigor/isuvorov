package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Igor Suvorov (mailto:parsentev@yandex.ru)
* @version $Id$
* @since 0.1
*/

public class CalculatorTest {

	/**
 	 * Test for add method.
 	 */
     @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
 	 * Test for subtract method.
 	 */
    @Test
    public void whenSubtractOneFromOneThenZero() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }

    /**
 	 * Test for div method.
 	 */
    @Test
    public void whenDivOneToOneThenOne() {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
 	 * Test for multiple method.
 	 */
    @Test
    public void whenMultipleOneTwoOneThenOne() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

}