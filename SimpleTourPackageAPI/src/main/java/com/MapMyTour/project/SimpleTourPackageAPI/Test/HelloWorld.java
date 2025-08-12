package com.MapMyTour.project.SimpleTourPackageAPI.Test;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelloWorld {
    private String message;

    public HelloWorld() {}

    public HelloWorld(String _message) {
        this.message = _message;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }
}
