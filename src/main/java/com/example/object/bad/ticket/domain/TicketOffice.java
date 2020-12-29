package com.example.object.bad.ticket.domain;

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

    public Ticket getTicket() {
        return tickeks.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
