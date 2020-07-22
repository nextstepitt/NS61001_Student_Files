// AuthorizationProvider.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.services;

import com.tc3.core.models.CardInfo;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

@Component
public class WidgetBankAuthorizationProvider implements IAuthorizationProvider {

    public String authorize(BigDecimal amount, CardInfo cardInfo) {

        String result = null;
        Random random = new Random();

        // The point of this mock is to return an authorization for one CardInfo, and no authorization
        // for anything else.

        if (random.nextInt() % 2 == 0) {

            return (UUID.randomUUID()).toString();
        }

        return result;
    }
}
