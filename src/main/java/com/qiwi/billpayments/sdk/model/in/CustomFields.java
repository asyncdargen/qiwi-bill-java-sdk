package com.qiwi.billpayments.sdk.model.in;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomFields {

    private final String apiClient;
    private final String apiClientVersion;

    @JsonCreator
    public CustomFields(
            @JsonProperty("apiClient") String apiClient,
            @JsonProperty("apiClientVersion") String apiClientVersion
    ) {
        this.apiClient = apiClient;
        this.apiClientVersion = apiClientVersion;
    }

}
