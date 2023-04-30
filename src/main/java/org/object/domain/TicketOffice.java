package org.object.domain;

import java.util.*;

public class TicketOffice {
    private long amount;

    private Queue<Ticket> tickets = new ArrayDeque<>();

    public TicketOffice(long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public long getAmount() {
        return amount;
    }


    public Ticket pickTicket() {
        if (tickets.isEmpty()) throw new RuntimeException("티켓 부족");
        return tickets.poll();
    }
}
