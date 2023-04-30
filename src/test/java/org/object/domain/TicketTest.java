package org.object.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {

    @Test
    @DisplayName("관람객에게 초대장을 보냄")
    public void invitationTest() throws Exception {
        //given
        Invitation invitation = new Invitation(LocalDateTime.of(2023, 4, 28, 18, 0));
        Audience audience = new Audience(new Bag(null, null, 0L));
        //when
        invitation.invite(audience);
        //then
        assertTrue(audience.hasInvitation());
    }

    @Test
    @DisplayName("초대장 일자 생성")
    public void invitationDateTest() {
        Invitation invitation = new Invitation(LocalDateTime.of(2023, 4, 28, 18, 0));
        assertEquals(LocalDateTime.of(2023, 4, 28, 18, 0), invitation.getWhen());
    }

    @Test
    @DisplayName("관람객이 갖는 초대장을 티켓으로 전환")
    public void exchangeInvitationToTicketTest() throws Exception {
        //given
        Invitation invitation = new Invitation(LocalDateTime.of(2023, 4, 28, 18, 0));
        Audience audience = new Audience(new Bag(invitation, null, 0));
        TicketSeller ticketSeller = new TicketSeller(new TicketOffice(1, new Ticket(5000L)));

        //when
        ticketSeller.sellTo(audience);
        //then
        assertNull(audience.getInvitation());
        assertTrue(audience.hasTicket());
    }

    @Test
    @DisplayName("영화 판매원이 티켓을 관람객에게 팔음")
    public void sellTicketBySellerTest() throws Exception {
        //given
        TicketSeller ticketSeller = new TicketSeller(new TicketOffice(1, new Ticket(5000L)));
        Audience audience = new Audience(new Bag(null, null, 5000L));
        //when
        ticketSeller.sellTo(audience);
        //then
        assertTrue(audience.hasTicket());
    }

    @Test
    @DisplayName("극장에서 관람객 맞이")
    public void theaterTest() throws Exception {
        //given
        Theater theater = new Theater(new TicketSeller(new TicketOffice(5000L, new Ticket(5000L))));
        Audience audience = new Audience(new Bag(null, null, 5000L));
        //when
        theater.enter(audience);
        //then
        assertTrue(audience.hasTicket());
    }

}
