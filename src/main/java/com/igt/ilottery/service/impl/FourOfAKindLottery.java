package com.igt.ilottery.service.impl;

import com.igt.ilottery.service.AbstractLottery;
import com.igt.ilottery.service.DrawingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Four of a kind lottery implementation.
 * 4 out of 6 numbers should match to win the prize.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
@Service
public class FourOfAKindLottery extends AbstractLottery {

    private static final int NUMBERS_TO_DRAW = 6;
    private static final int DRAW_BOUNDARY = 6;

    @Autowired
    public FourOfAKindLottery(@Qualifier("boundedDrawer") DrawingService drawingService) {
        this.drawer = drawingService;
    }

    @Override
    protected List<Integer> draw() {
        return drawer.boundedDraw(NUMBERS_TO_DRAW, DRAW_BOUNDARY);
    }

    @Override
    protected void checkDrawIntegrity(List<Integer> drawnNumbers) {
        if(drawnNumbers.size() != NUMBERS_TO_DRAW || drawOutOfBounds(drawnNumbers)) {
            throw new IllegalStateException();
        }
    }

    @Override
    protected boolean isWinningDraw(List<Integer> drawnNumbers) {
        List<Integer> frequencyList = new ArrayList<>();
        for(Integer drawnNumber : drawnNumbers) {
            frequencyList.add(Collections.frequency(drawnNumbers, drawnNumber));
        }
        return Collections.max(frequencyList) >= 4;
    }

    private boolean drawOutOfBounds(List<Integer> drawnNumbers) {
        for(Integer i : drawnNumbers) {
            if(i >= DRAW_BOUNDARY) {
                return true;
            }
        }
        return false;
    }
}
