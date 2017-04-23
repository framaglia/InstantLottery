package com.igt.ilottery.rng.impl;

import com.igt.ilottery.rng.RandomNumberGenerator;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Simple {@link RandomNumberGenerator} implementation.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
@Service
public class SimpleRNG implements RandomNumberGenerator {

    private static final int BOUND = 6;
    private Random random = new Random();

    public int nextInt() {
        return random.nextInt(BOUND);
    }
}
