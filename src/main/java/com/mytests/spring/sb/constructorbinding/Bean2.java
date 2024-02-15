package com.mytests.spring.sb.constructorbinding;


public class Bean2 {
    String id;

    public Bean2(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bean1{" +
               "id='" + id + '\'' +
               '}';
    }
}
