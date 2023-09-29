package com.example.consumingrestapi;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(long id, String content) {
}
