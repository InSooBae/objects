package org.object.domain.ticketsellexample;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
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

    public long buy(Ticket ticket) {
        return bag.hold(ticket);
    }

    public void punched(Invitation invitation) {
        bag.hold(invitation);
    }
}
