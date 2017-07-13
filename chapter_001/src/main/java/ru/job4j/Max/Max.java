package ru.job4j.max;

/**
 * Class Max для нахождения максимума 2 чисел.
 * @author suvorovigor
 * @since 13.07.2017
 * @version 1
 */

public class Max {

/**
 * Find max value.
 * @param first - arg.
 * @param second - arg.
 * @return result.
 */

public int max(int first, int second) {

int result = first > second ? first : second;
return result;
	}

}