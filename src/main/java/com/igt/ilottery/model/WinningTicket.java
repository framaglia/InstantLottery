package com.igt.ilottery.model;

import java.util.List;

/**
 * TODO class description
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
public class WinningTicket extends Ticket {

    public WinningTicket(List<Integer> drawnNumbers) {
        super(drawnNumbers);
        this.isWinning = true;
    }
}
