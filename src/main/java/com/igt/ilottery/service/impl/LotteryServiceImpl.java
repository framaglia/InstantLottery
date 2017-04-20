package com.igt.ilottery.service.impl;

import com.igt.ilottery.model.Ticket;
import com.igt.ilottery.rng.RandomNumberGenerator;
import com.igt.ilottery.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Lottery Service implementation.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
@Service
public class LotteryServiceImpl implements LotteryService {

    private static final int NUMBERS_TO_DRAW = 5;

    @Autowired
    private RandomNumberGenerator rng;

    public Ticket extractTicket() {
        Ticket ticket;
        List<Integer> drawnNumbers = new ArrayList<Integer>();
        int actualDraw = 0;
        while(actualDraw < NUMBERS_TO_DRAW) {
            drawnNumbers.add(rng.nextInt());
            actualDraw++;
        }
        for(Integer drawnNumber : drawnNumbers) {
            
        }
        ticket = new Ticket(drawnNumbers);
        return ticket;
    }
}
