package com.igt.ilottery.service;

import com.igt.ilottery.model.LosingTicket;
import com.igt.ilottery.model.Ticket;
import com.igt.ilottery.model.WinningTicket;

import java.util.List;

/**
 * Class providing common steps on lottery extracting system.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
public abstract class AbstractLottery implements LotteryService {

    /**
     * Delegates the draw mechanism to an external service.
     * Actual drawing service should be provided when extending this class.
     */
    protected DrawingService drawer;

    @Override
    public Ticket extractTicket() {
        List<Integer> drawnNumbers = draw();
        checkDrawIntegrity(drawnNumbers);
        if(isWinningDraw(drawnNumbers)) {
            return new WinningTicket(drawnNumbers);
        } else {
            return new LosingTicket(drawnNumbers);
        }
    }

    protected abstract List<Integer> draw();

    protected abstract void checkDrawIntegrity(List<Integer> drawnNumbers);

    protected abstract boolean isWinningDraw(List<Integer> drawnNumbers);
}
