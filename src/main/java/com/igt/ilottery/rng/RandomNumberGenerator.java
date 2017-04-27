package com.igt.ilottery.rng;

/**
 * Interface exposing RNG functionalities.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
public interface RandomNumberGenerator {

    /**
     * Generates a number using a random function.
     *
     * @return The generated integer.
     */
    int nextInt();

    /**
     * Generates a number in a given range using a random function.
     *
     * @param bound The boundary of the random extraction.
     * @return
     */
    int nextIntInRange(int bound);
}
