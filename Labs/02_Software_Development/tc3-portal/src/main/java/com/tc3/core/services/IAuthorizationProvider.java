// IAuthorizationProvider.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.services;

import com.tc3.core.models.CardInfo;

import java.math.BigDecimal;

public interface IAuthorizationProvider {

    String authorize(BigDecimal amount, CardInfo cardInfo);
}
