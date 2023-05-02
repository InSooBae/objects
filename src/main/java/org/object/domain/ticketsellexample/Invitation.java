package org.object.domain.ticketsellexample;

import java.time.LocalDateTime;

public class Invitation {
    private LocalDateTime when;

    public Invitation(LocalDateTime when) {
        this.when = when;
    }

    public LocalDateTime getWhen() {
        return when;
    }


    public void invite(Audience audience) {
        audience.punched(this);
    }
}
