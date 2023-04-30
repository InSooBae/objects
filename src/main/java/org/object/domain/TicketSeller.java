package org.object.domain;

public class TicketSeller {
    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        if (!audience.hasInvitation()) audience.payAmount(ticketOffice.getAmount());
        else audience.deleteInvitation();
        audience.setTicket(ticketOffice.pickTicket());
    }
}
