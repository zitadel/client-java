package com.zitadel;

public class ZitadelException extends Exception {

    private static final long serialVersionUID = 13244L;

    public ZitadelException(String message) {
        super(message);
    }

    public ZitadelException(String message, Exception e) {
        super(message, e);
    }
}
