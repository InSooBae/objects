package org.object.domain;

public class Ticket {
    private long fee;

    public Ticket(long fee) {
        this.fee = fee;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }
}
