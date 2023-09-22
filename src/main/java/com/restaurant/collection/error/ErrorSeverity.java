package com.restaurant.collection.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorSeverity {

    INFO("info"),
    FATAL("fatal"),
    ERROR("error");

    private final String code;
}
