package com.igt.ilottery.service.impl;

import com.igt.ilottery.model.Ticket;
import com.igt.ilottery.service.DrawingService;
import com.igt.ilottery.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Four of a kind lottery implementation. Same 4 out of 6 numbers should match to win the prize.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
@Service
public class FourOfAKindLottery implements LotteryService {

    private static final int NUMBERS_TO_DRAW = 6;
    private static final int WIN_THRESHOLD = 4;

    @Autowired
    private DrawingService drawer;

    public Ticket extractTicket() {
        List<Integer> drawnNumbers = drawer.draw(NUMBERS_TO_DRAW);
        checkDrawIntegrity(drawnNumbers);
        return createTicket(drawnNumbers, checkForWin(drawnNumbers));
    }

    private void checkDrawIntegrity(List<Integer> drawnNumbers) {
        if(drawnNumbers.size() != NUMBERS_TO_DRAW) {
            throw new IllegalStateException();
        }
    }

    private boolean checkForWin(List<Integer> drawnNumbers) {
        List<Integer> frequencyList = new ArrayList<>();
        for(Integer drawnNumber : drawnNumbers) {
            frequencyList.add(Collections.frequency(drawnNumbers, drawnNumber));
        }
        return Collections.max(frequencyList) >= WIN_THRESHOLD;
    }

    private Ticket createTicket(List<Integer> drawnNumbers, boolean isWinning) {
        return new Ticket(drawnNumbers, isWinning);
    }
}
