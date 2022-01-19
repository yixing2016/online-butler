package com.sqin.common.dto;

import com.sqin.common.constant.CommonStatusEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Sheng, Qin
 * 2022-01-19 15:47
 */
@Data
@Accessors(chain = true)
public class ResponseResult<T> implements Serializable {

    public static final long serialVersionUID = -2073390651767969040L;

    private int code;
    private String message;
    private T data;

    public static <T> ResponseResult success(T data) {
        return new ResponseResult().setCode(CommonStatusEnum.SUCCESS.getCode())
                .setMessage(CommonStatusEnum.SUCCESS.getValue())
                .setData(data);
    }

}
