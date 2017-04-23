package com.igt.ilottery.service;

import java.util.List;

/**
 * TODO class description
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
public interface DrawingService {

    /**
     * Draws a certain amount of numbers.
     *
     * @param numbersToDraw How many numbers to draw.
     * @return A list containing the drawn numbers.
     */
    List<Integer> draw(int numbersToDraw);
}
