package com.tc3.core.__mocks__;

import com.tc3.core.models.CardInfo;
import com.tc3.core.services.IAuthorizationProvider;

import java.math.BigDecimal;
import java.util.UUID;

public class AuthorizationProviderMock implements IAuthorizationProvider {

    public String authorize(BigDecimal amount, CardInfo cardInfo) {

        String result = null;

        if ("378282246310005".equals(cardInfo.getCardNumber())) {

            result = (UUID.randomUUID()).toString();

        } else if ("2221001223630333".equals(cardInfo.getCardNumber())) {

            result = null;

        } else {

            throw new IllegalArgumentException();
        }

        return result;
    }
}
