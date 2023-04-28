package org.object.domain;

public class Audience {
    Invitation invitation;

    public Invitation getInvitation() {
        return invitation;
    }

    public void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }
}
