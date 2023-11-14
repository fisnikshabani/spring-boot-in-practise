package com.example.customfailureanalyzer.exception;

import lombok.Getter;

@Getter
public class UrlNotAccessibleException extends RuntimeException {

    private String url;

    public UrlNotAccessibleException(String url) {
        this(url, null);
    }

    public UrlNotAccessibleException(String url, Throwable cause) {
        super("The url " + url + " is not accessible", cause);
        this.url = url;
    }
}
