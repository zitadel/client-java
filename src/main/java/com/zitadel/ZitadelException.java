package com.zitadel;

public class ZitadelException extends RuntimeException {

    private static final long serialVersionUID = 13244L;

    public ZitadelException(String message) {
        super(message);
    }

    public ZitadelException(String message, Exception e) {
        super(message, e);
    }
}
