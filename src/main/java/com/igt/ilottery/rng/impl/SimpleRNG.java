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

    private static final Random random = new Random();

    @Override
    public int nextInt() {
        return random.nextInt();
    }

    @Override
    public int nextIntInRange(int bound) {
        return random.nextInt(bound);
    }
}
