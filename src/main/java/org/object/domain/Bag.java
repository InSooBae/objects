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
        minusAmount(amount);
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

    private boolean hasInvitation() {
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

    private void minusAmount(long amount) {
        this.amount -= amount;
    }

    public long hold(Ticket ticket) {
        long paidAmount = 0L;
        if (!hasInvitation()) paidAmount = payAmount(ticket.getFee());
        else deleteInvitation();
        setTicket(ticket);
        return paidAmount;
    }

    public void hold(Invitation invitation) {
        setInvitation(invitation);
    }
}
