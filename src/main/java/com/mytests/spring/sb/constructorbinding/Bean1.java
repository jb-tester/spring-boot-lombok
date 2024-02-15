package com.mytests.spring.sb.constructorbinding;


public class Bean1 {

    String id;

    public Bean1(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bean1{" +
               "id='" + id + '\'' +
               '}';
    }
}
