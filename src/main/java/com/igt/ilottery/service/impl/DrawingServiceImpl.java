package com.igt.ilottery.service.impl;

import com.igt.ilottery.rng.RandomNumberGenerator;
import com.igt.ilottery.service.DrawingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO class description
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
@Service
public class DrawingServiceImpl implements DrawingService {

    @Autowired
    RandomNumberGenerator rng;

    @Override
    public List<Integer> draw(int numbersToDraw) {
        List<Integer> drawnNumbers = new ArrayList<>();
        for(int actualDraw = 0; actualDraw < numbersToDraw; actualDraw++) {
            drawnNumbers.add(rng.nextInt());
        }
        return drawnNumbers;
    }
}
