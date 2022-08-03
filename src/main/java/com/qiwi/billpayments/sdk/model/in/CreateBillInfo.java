package com.qiwi.billpayments.sdk.model.in;

import com.qiwi.billpayments.sdk.model.MoneyAmount;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.ZonedDateTime;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class CreateBillInfo {

    private final String billId;
    private final MoneyAmount amount;
    private final String comment;
    private final ZonedDateTime expirationDateTime;
    private final Customer customer;
    private final String successUrl;

}
