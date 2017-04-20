package com.igt.ilottery.api;

import com.igt.ilottery.model.Ticket;
import com.igt.ilottery.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.igt.ilottery.api.LotteryRestController.BASE_PATH;

/**
 * Class exposing REST API for instant lottery.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
@RestController
@RequestMapping(BASE_PATH)
@CrossOrigin
public class LotteryRestController {

    public static final String BASE_PATH = "/lottery";
    public static final String PURCHASE_TICKET_PATH = "/purchaseTicket";

    @Autowired
    private LotteryService lotteryService;

    @RequestMapping(value = PURCHASE_TICKET_PATH, method = RequestMethod.GET)
    public Ticket bet() {
        return lotteryService.extractTicket();
    }
}
