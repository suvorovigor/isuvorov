package ru.job4j.calculator;

/**
 * Class Класс для вычисление арифметических операций + - * /.
 * @author suvorovigor
 * @since 12.07.2017
 * @version 1
 */

public class Calculator {

   /**
	* Result of the method.
	*/
	private double result;

	/**
     * Add two doubles.
     * @param first - arg.
     * @param second - arg.
     */
	public void add(double first, double second) {

		this.result = first + second;
	}

    /**
     * Subsctract one double from another.
     * @param first - arg.
     * @param second - arg.
     */
	public void subtract(double first, double second) {

		this.result = first - second;
	}

    /**
     * Div one double to another.
     * @param first - arg.
     * @param second - arg.
     */
	public void div(double first, double second) {

		this.result = first / second;
	}

	/**
	 * Multiple one double to another.
     * @param first - arg.
     * @param second - arg.
     */
	public void mulpiple(double first, double second) {

		this.result = first * second;
	}

    /**
     * Get result.
	 * @return result.
	 */
	public double getResult() {

		return this.result;
    }
}