package com.qiwi.billpayments.sdk.model.in;

import com.qiwi.billpayments.sdk.model.MoneyAmount;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class PaymentInfo {

    private final String publicKey;
    private final MoneyAmount amount;
    private final String billId;
    private final String successUrl;

}
