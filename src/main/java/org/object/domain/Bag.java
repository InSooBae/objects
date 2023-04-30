package org.object.domain;

public class Bag {

    private Invitation invitation;

    private Ticket ticket;

    private long amount;

    public Bag(Invitation invitation, Ticket ticket, long amount) {
        this.invitation = invitation;
        this.ticket = ticket;
        this.amount = amount;
    }


    public long payAmount(long amount) {
        if (getAmount() < amount) throw new RuntimeException("금액 부족");
        this.amount -= amount;
        return amount;
    }
    public long getAmount() {
        return amount;
    }

    public Invitation getInvitation() {
        return invitation;
    }

    public void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void deleteInvitation() {
        invitation = null;
    }
}
