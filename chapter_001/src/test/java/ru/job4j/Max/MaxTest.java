package ru.job4j.max;

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

public class MaxTest {

/**
 * Test method.
 */

@Test
public void whenFirstLessThanSecond() {
    Max maxim = new Max();
    int result = maxim.max(1, 2);
    assertThat(result, is(2));
}

/**
 * Test method.
 */

@Test
public void whenFirstMoreThanSecond() {
    Max maxim = new Max();
    int result = maxim.max(2, 1);
    assertThat(result, is(2));
}

}