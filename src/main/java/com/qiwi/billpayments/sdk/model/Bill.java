package com.qiwi.billpayments.sdk.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Bill {

    private final String siteId;
    private final String billId;
    private final MoneyAmount amount;
    private final BillStatus status;

}
