package ru.job4j.condition;

/**
 * Class Point для точки.
 * @author suvorovigor
 * @since 14.07.2017
 * @version 1
 */

public class Point {

 /**
  * Координата x.
  */

   private int x;
 /**
  * Координата y.
  */
   private int y;

/**
 * Add two doubles.
 * @param x - arg.
 * @param y - arg.
 */

   public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }

  /**
   * Get x.
   * @return x.
   */

  public int getX() {
      return this.x;
  }

  /**
   * Get y.
   * @return y.
   */

  public int getY() {
     return this.y;
  }

 /**
  * @param a - arg.
  * @param b - arg.
  * @return is.
  */

  public boolean is(int a, int b) {
    return y == a * x + b ? true : false;
  }

  }