// ICreditCardValidator.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.services;

import com.tc3.core.models.CardInfo;

public interface ICreditCardValidator {

    boolean validateCardInfo(CardInfo cardInfo);
}
