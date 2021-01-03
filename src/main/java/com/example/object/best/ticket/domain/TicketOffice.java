package com.example.object.best.ticket.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickeks = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickeks) {
        this.amount = amount;
        this.tickeks = Arrays.asList(tickeks);
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickeks.remove(0);
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }
}
