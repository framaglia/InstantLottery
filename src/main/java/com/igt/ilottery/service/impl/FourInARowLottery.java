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
 * Lottery Service implementation.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
@Service
public class FourInARowLottery implements LotteryService {

    private static final int NUMBERS_TO_DRAW = 6;
    private static final int WIN_THRESHOLD = 4;

    @Autowired
    private DrawingService drawer;

    public Ticket extractTicket() {
        List<Integer> drawnNumbers = drawer.draw(NUMBERS_TO_DRAW);
        checkDrawIntegrity(drawnNumbers);
        List<Integer> frequencyList = new ArrayList<>();
        for(Integer drawnNumber : drawnNumbers) {
            frequencyList.add(Collections.frequency(drawnNumbers, drawnNumber));
        }
        boolean isWinning = Collections.max(frequencyList) >= WIN_THRESHOLD;
        return createTicket(drawnNumbers, isWinning);
    }

    private void checkDrawIntegrity(List<Integer> drawnNumbers) {
        if(drawnNumbers.size() != NUMBERS_TO_DRAW) {
            throw new IllegalStateException();
        }
    }

    private Ticket createTicket(List<Integer> drawnNumbers, boolean isWinning) {
        return new Ticket(drawnNumbers, isWinning);
    }
}
