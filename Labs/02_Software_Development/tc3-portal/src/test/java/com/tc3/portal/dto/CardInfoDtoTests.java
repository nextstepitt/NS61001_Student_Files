// CardInfoDtoTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//
// The point of this test is to make sure that data doesn't leak through the constructor.
//

package com.tc3.portal.dto;

import com.tc3.core.models.CardInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CardInfoDtoTests {

    private CardInfo cardInfo;
    private CardInfoDto cardInfoDto;

    @BeforeEach
    public void setup() {

        cardInfo = new CardInfo() {{
            setName("John Q Public");
            setCardNumber("378282246310005");
            setExpires(new java.sql.Date(System.currentTimeMillis()));
            setCcv(168);
        }};

        cardInfoDto = new CardInfoDto(cardInfo);
    }

    @Test
    public void nameNotInitialized() {

        assertNull(cardInfoDto.getName());
    }

    @Test
    public void cardNumberInitialized() {

        assertEquals(cardInfo.getCardNumberMasked(), cardInfoDto.getCardNumber());
    }

    @Test
    public void expiresInitialized() {

        assertEquals(cardInfo.getExpires(), cardInfoDto.getExpires());
    }

    @Test
    public void ccvNotInitialized() {

        assertEquals(0, cardInfoDto.getCcv());
    }
}
