package com.igt.ilottery.model;

import java.util.List;

/**
 * Class modelling a lottery ticket in the system.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
public abstract class Ticket {

    private List<Integer> drawnNumbers;

    protected boolean isWinning;

    public Ticket(List<Integer> drawnNumbers) {
        this.drawnNumbers = drawnNumbers;
    }

    public List<Integer> getDrawnNumbers() {
        return drawnNumbers;
    }

    public boolean isWinning() {
        return isWinning;
    }

}
