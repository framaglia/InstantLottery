package com.igt.ilottery.service;

import com.igt.ilottery.model.Ticket;

import java.util.List;

/**
 * Class providing common steps on lottery extracting system.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
public abstract class AbstractLottery implements LotteryService {

    /**
     * Delegates the draw mechanism to a service.
     * Actual draw service should be provided when extending this class.
     */
    protected DrawingService drawer;

    @Override
    public Ticket extractTicket() {
        List<Integer> drawnNumbers = draw();
        checkDrawIntegrity(drawnNumbers);
        return new Ticket(drawnNumbers, isWinningDraw(drawnNumbers));
    }

    protected abstract List<Integer> draw();

    protected abstract void checkDrawIntegrity(List<Integer> drawnNumbers);

    protected abstract boolean isWinningDraw(List<Integer> drawnNumbers);
}
