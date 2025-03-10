package com.qiwi.billpayments.sdk.exception;

import com.qiwi.billpayments.sdk.model.out.ErrorResponse;
import lombok.Getter;

@Getter
public class BillPaymentServiceException extends RuntimeException {

    private final ErrorResponse response;
    private final int httpStatus;

    public BillPaymentServiceException(ErrorResponse response, int httpStatus) {
        super(response.getErrorCode());
        this.response = response;
        this.httpStatus = httpStatus;
    }

}
