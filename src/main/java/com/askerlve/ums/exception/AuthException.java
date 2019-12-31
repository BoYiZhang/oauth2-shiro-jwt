package com.askerlve.ums.exception;

import org.springframework.security.core.AuthenticationException;


public class AuthException extends AuthenticationException {

    private int code;

    public AuthException(String msg, Throwable t) {
        super(msg, t);
    }

    public AuthException(String msg) {
        super(msg);
    }

    public AuthException(String msg, int code) {
        super(msg);
        this.code = code;
    }

    public AuthException(String msg, Throwable t, int code) {
        super(msg, t);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
