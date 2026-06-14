package com.zitadel;

public class ZitadelException extends RuntimeException {

  @java.io.Serial private static final long serialVersionUID = 13244L;

  public ZitadelException(String message) {
    super(message);
  }

  public ZitadelException(String message, Throwable cause) {
    super(message, cause);
  }
}
