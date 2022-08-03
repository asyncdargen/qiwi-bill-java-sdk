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
public class CreateBillRequest {

    private final MoneyAmount amount;
    private final String comment;
    private final ZonedDateTime expirationDateTime;
    private final Customer customer;
    private final CustomFields customFields;

    public static CreateBillRequest create(CreateBillInfo info, CustomFields customFields) {
        return new CreateBillRequest(
                info.getAmount(),
                info.getComment(),
                info.getExpirationDateTime(),
                info.getCustomer(),
                customFields
        );
    }

}
