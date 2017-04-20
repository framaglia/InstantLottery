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
     * @return The generated integer
     */
    int nextInt();
}
