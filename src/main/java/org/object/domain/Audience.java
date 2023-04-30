package org.object.domain;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public boolean hasInvitation() {
        return bag.hasInvitation();
    }

    public Ticket getTicket() {
        return bag.getTicket();
    }

    public Invitation getInvitation() {
        return bag.getInvitation();
    }

    public boolean hasTicket() {
        return bag.hasTicket();
    }

    public void setTicket(Ticket ticket) {
        bag.setTicket(ticket);
    }

    public void payAmount(long amount) {
        bag.payAmount(amount);
    }

    public void deleteInvitation() {
        bag.deleteInvitation();
    }

    public void setInvitation(Invitation invitation) {
        bag.setInvitation(invitation);
    }
}
