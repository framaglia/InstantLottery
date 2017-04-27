package com.igt.ilottery.service.impl;

import com.igt.ilottery.rng.RandomNumberGenerator;
import com.igt.ilottery.service.DrawingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Bounded Drawing implementation.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
@Service(value = "boundedDrawer")
public class BoundedDrawingServiceImpl implements DrawingService {

    @Autowired
    RandomNumberGenerator rng;

    @Override
    public List<Integer> draw(int numbersToDraw) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Integer> boundedDraw(int numbersToDraw, int bound) {
        List<Integer> drawnNumbers = new ArrayList<>();
        for(int actualDraw = 0; actualDraw < numbersToDraw; actualDraw++) {
            drawnNumbers.add(rng.nextIntInRange(bound));
        }
        return drawnNumbers;
    }
}
