package com.qiwi.billpayments.sdk.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum BillStatus {

    WAITING,
    PAID,
    REJECTED,
    EXPIRED;

}
