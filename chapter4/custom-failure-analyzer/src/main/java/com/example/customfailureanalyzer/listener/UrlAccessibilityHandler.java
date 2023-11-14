package com.example.customfailureanalyzer.listener;

import com.example.customfailureanalyzer.exception.UrlNotAccessibleException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UrlAccessibilityHandler {

    @Value("${api.url:https://dog.ceo/}")
    private String url;

    @EventListener (classes = ContextRefreshedEvent.class)
    public void listen() {
        //for demonstration purpose, we're throwing the exception assuming the url is not accessible
        throw new UrlNotAccessibleException(url);
    }
}
