package com.igt.ilottery.service;

import com.igt.ilottery.model.Purchase;
import com.igt.ilottery.model.Ticket;

/**
 * Interface exposing lottery functionalities.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
public interface LotteryService {

    /**
     * Extract a ticket.
     *
     * @return The {@link Ticket} of the extraction
     */
    Ticket extractTicket();
}
