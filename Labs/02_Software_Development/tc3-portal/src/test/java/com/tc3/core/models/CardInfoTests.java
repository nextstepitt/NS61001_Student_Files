// CardInfoTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//
// Check the constructor, equals, and hashCode.
//

package com.tc3.core.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.tc3.portal.dto.CardInfoDto;

public class CardInfoTests {
    
    private CardInfoDto cardInfoDto;
    private CardInfo cardInfo;

    @BeforeEach
    public void setup() {

        cardInfoDto = new CardInfoDto() {{
            setName("John Q Public");
            setCardNumber("378282246310005");
            setExpires(new java.sql.Date(System.currentTimeMillis()));
            setCcv(168);
        }};

        cardInfo = new CardInfo(cardInfoDto);
    }

    @Test
    public void getsNameFromDto() {

        assertEquals(cardInfoDto.getName(), cardInfo.getName());
    }
    
    @Test
    public void getsCardNumberFromDto() {

        assertEquals(cardInfoDto.getCardNumber(), cardInfo.getCardNumber());
    }

    @Test
    public void getsExpiresFromDto() {

        assertEquals(cardInfoDto.getExpires(), cardInfo.getExpires());
    }

    @Test
    public void getsCcvFromDto() {

        assertEquals(cardInfoDto.getCcv(), cardInfo.getCcv());
    }

    @Test
    public void assertsIsEqual() {

        CardInfo newCardInfo = new CardInfo(cardInfoDto);

        assertEquals(cardInfo, newCardInfo);
    }

    @Test
    public void assertsIsNotEqualWithDifferentName() {

        CardInfo newCardInfo = new CardInfo(cardInfoDto);

        newCardInfo.setName("Robert Smith");
        assertNotEquals(cardInfo, newCardInfo);
    }

    @Test
    public void assertsIsNotEqualWithDifferentCardNumber() {

        CardInfo newCardInfo = new CardInfo(cardInfoDto);

        newCardInfo.setCardNumber("2220991223630336");
        assertNotEquals(cardInfo, newCardInfo);
    }

    @Test
    public void assertsIsNotEqualWithDifferentExpires() {

        CardInfo newCardInfo = new CardInfo(cardInfoDto);

        // Make sure we are at least one minute off for the time.

        newCardInfo.setExpires(new java.sql.Date(System.currentTimeMillis() + 60000));
        assertNotEquals(cardInfo, newCardInfo);
    }

    @Test
    public void assertsIsNotEqualWithDifferentCcv() {

        CardInfo newCardInfo = new CardInfo(cardInfoDto);

        newCardInfo.setCcv(169);
        assertNotEquals(cardInfo, newCardInfo);
    }

    @Test
    public void assertHashIsEqual() {

        CardInfo newCardInfo = new CardInfo(cardInfoDto);

        assertEquals(cardInfo.hashCode(), newCardInfo.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentName() {

        CardInfo newCardInfo = new CardInfo(cardInfoDto);

        newCardInfo.setName("Robert Smith");
        assertNotEquals(cardInfo.hashCode(), newCardInfo.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentCardNumber() {

        CardInfo newCardInfo = new CardInfo(cardInfoDto);

        newCardInfo.setCardNumber("2220991223630336");
        assertNotEquals(cardInfo.hashCode(), newCardInfo.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentExpires() {

        CardInfo newCardInfo = new CardInfo(cardInfoDto);

        // Make sure we are at least one minute off for the time.

        newCardInfo.setExpires(new java.sql.Date(System.currentTimeMillis() + 60000));
        assertNotEquals(cardInfo, newCardInfo);
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentCcv() {

        CardInfo newCardInfo = new CardInfo(cardInfoDto);

        newCardInfo.setCcv(169);
        assertNotEquals(cardInfo, newCardInfo);
    }
}
