package org.acme;

import jakarta.inject.Singleton;

@Singleton
public class T3 {
    public String hello() {
        return "Hello DI";
    }
}
