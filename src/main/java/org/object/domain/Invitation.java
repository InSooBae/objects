package org.object.domain;

import java.time.LocalDateTime;

public class Invitation {

    public void invite(Audience audience) {
        audience.setInvitation(new Invitation());
    }
}
