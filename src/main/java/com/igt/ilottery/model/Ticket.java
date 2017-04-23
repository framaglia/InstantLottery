package com.igt.ilottery.model;

import java.util.List;

/**
 * Class modelling a lottery ticket in the system.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
public class Ticket {

    private List<Integer> drawnNumbers;

    private boolean isWinning;

    public Ticket(List<Integer> drawnNumbers, boolean isWinning) {
        this.drawnNumbers = drawnNumbers;
        this.isWinning = isWinning;
    }

    public List<Integer> getDrawnNumbers() {
        return drawnNumbers;
    }

    public void setDrawnNumbers(List<Integer> drawnNumbers) {
        this.drawnNumbers = drawnNumbers;
    }

    public boolean isWinning() {
        return isWinning;
    }

    public void setWinning(boolean winning) {
        isWinning = winning;
    }
}
