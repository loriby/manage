package com.github.digital.security.common.exception.auth;


import com.github.digital.security.common.constant.CommonConstants;
import com.github.digital.security.common.exception.BaseException;

/**
 * Created by ace on 2017/9/10.
 */
public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
