// CardInfoDto.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.portal.dto;

import com.tc3.core.models.CardInfo;

import java.sql.Date;

public class CardInfoDto {

    private String cardNumber;
    private String name;
    private Date expires;
    private int ccv;

    public CardInfoDto() {
    }

    public CardInfoDto(CardInfo cardInfo) {

        this();

        // The only outbound data allowed is the masked card number and expiration date.

        // this.setName(cardInfo.getName());
        this.setCardNumber(cardInfo.getCardNumberMasked());
        this.setExpires(cardInfo.getExpires());
        // this.setCcv(cardInfo.getCcv());
    }

    public String getCardNumber() {

        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {

        this.cardNumber = cardNumber;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Date getExpires() {

        return expires;
    }

    public void setExpires(Date expires) {

        this.expires = expires;
    }

    public int getCcv() {

        return ccv;
    }

    public void setCcv(int ccv) {

        this.ccv = ccv;
    }
}
