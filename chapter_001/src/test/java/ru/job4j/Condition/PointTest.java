package ru.job4j.condition;

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

public class PointTest {

  /**
   * Test for add method.
   */

     @Test
    public void isLocatedOnTheFunction() {
        Point point = new Point(6, 9);
        int x = point.getX();
        int y = point.getY();
        boolean result = point.is(1, 3);
        boolean expected = true;
        assertThat(result, is(expected));

    }
  }