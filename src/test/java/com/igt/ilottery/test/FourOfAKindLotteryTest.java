package com.igt.ilottery.test;

import com.igt.ilottery.model.Ticket;
import com.igt.ilottery.service.DrawingService;
import com.igt.ilottery.service.LotteryService;
import com.igt.ilottery.service.impl.FourOfAKindLottery;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

/**
 * Unit tests for {@link FourOfAKindLottery}
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
public class FourOfAKindLotteryTest {

    private List<Integer> winningList;
    private List<Integer> losingList;
    private List<Integer> corruptedList;

    @Mock
    DrawingService drawingService;

    /**
     * The service under test
     */
    @InjectMocks
    LotteryService lotteryService;

    @Before
    public void setup() {
        lotteryService = new FourOfAKindLottery();
        MockitoAnnotations.initMocks(this);
        setupLists();
    }

    @Test
    public void winningTicketTest() {
        when(drawingService.draw(anyInt())).thenReturn(winningList);
        Ticket winningTicket = lotteryService.extractTicket();
        Assert.assertTrue(winningTicket.isWinning());
    }

    @Test
    public void losingTicketTest() {
        when(drawingService.draw(anyInt())).thenReturn(losingList);
        Ticket losingTicket = lotteryService.extractTicket();
        Assert.assertFalse(losingTicket.isWinning());
    }

    @Test(expected = IllegalStateException.class)
    public void illegalStateOnDrawFailure() {
        when(drawingService.draw(anyInt())).thenReturn(corruptedList);
        lotteryService.extractTicket();
    }

    private void setupLists() {
        winningList = new ArrayList<>();
        winningList.add(1);
        winningList.add(2);
        winningList.add(3);
        winningList.add(2);
        winningList.add(2);
        winningList.add(2);

        losingList = new ArrayList<>();
        losingList.add(0);
        losingList.add(1);
        losingList.add(0);
        losingList.add(3);
        losingList.add(3);
        losingList.add(2);

        corruptedList = new ArrayList<>();
        corruptedList.add(0);
        corruptedList.add(0);
        corruptedList.add(0);
        corruptedList.add(0);
        corruptedList.add(1);
    }

}
