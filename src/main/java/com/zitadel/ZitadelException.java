package com.zitadel;

public class ZitadelException extends Exception {

    public ZitadelException(String message) {
        super(message);
    }

    public ZitadelException(String message, Exception e) {
        super(message, e);
    }
}
