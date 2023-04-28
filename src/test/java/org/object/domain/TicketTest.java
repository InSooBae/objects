package org.object.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {
    
    @Test
    @DisplayName("관람객에게 초대장을 보냄")
    public void invitationTest() throws Exception {
        //given
        Invitation invitation = new Invitation();
        Audience audience = new Audience();
        //when
        invitation.invite(audience);
        //then
        assertTrue(audience.hasInvitation());
    }
}
