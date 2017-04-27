package com.igt.ilottery.service;

import java.util.List;

/**
 * Drawing service interface.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
public interface DrawingService {

    /**
     * Draws a certain amount of numbers.
     *
     * @param numbersToDraw How many numbers to boundedDraw.
     * @return A list containing the drawn numbers.
     */
    List<Integer> draw(int numbersToDraw);

    /**
     * Draws a certain amount of numbers in a bounded range.
     *
     * @param numbersToDraw How many numbers to boundedDraw.
     * @param bound whether there's a bound.
     * @return A list containing the drawn numbers.
     */
    List<Integer> boundedDraw(int numbersToDraw, int bound);
}
