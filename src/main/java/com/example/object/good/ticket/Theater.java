package com.example.object.good.ticket;

import com.example.object.good.ticket.domain.Audience;
import com.example.object.good.ticket.domain.TicketSeller;


public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
