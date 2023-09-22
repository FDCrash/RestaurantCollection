package com.restaurant.collection.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Predefined error codes for the error response.
 */
@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    INVALID("invalid"),
    CONFLICT("conflict"),
    DUPLICATE("duplicate"),
    NOT_SUPPORTED("not-supported"),
    EXCEPTION("exception");

    private final String code;
}
