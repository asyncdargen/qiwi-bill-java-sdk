package com.qiwi.billpayments.sdk.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class ResponseData {

    private final String body;
    private final int httpStatus;

}
