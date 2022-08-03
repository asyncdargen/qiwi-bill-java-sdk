package com.qiwi.billpayments.sdk.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalSerializer extends JsonSerializer<BigDecimal> {

    @Getter
    @Accessors(fluent = true)
    private final Class<BigDecimal> handledType = BigDecimal.class;

    @Override
    public void serialize(BigDecimal value, JsonGenerator generator, SerializerProvider provider) throws IOException {
        generator.writeString(value.setScale(2, RoundingMode.HALF_DOWN).toString());
    }

}
