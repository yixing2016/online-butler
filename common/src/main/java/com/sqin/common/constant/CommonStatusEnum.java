package com.sqin.common.constant;

import lombok.Getter;

/**
 * @author Sheng, Qin
 * 2022-01-19 15:09
 */
@Getter
public enum CommonStatusEnum {

    // http response
    SUCCESS(0, "success"),
    FAIL(1, "fail"),

    // commodity status
    New(0, "new"),
    Done(1, "done"),
    Cancel(2, "cancel");

    private final String value;
    private final int code;

    CommonStatusEnum(int code, String value) {
        this.value = value;
        this.code = code;
    }

}
