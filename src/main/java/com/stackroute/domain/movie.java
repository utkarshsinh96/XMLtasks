package com.stackroute.domain;
public class movie {
    private actor Actor;
    public movie(actor Actor){
        this.Actor=Actor;
    }

    @Override
    public String toString() {
        return "movie{" +
                "Actor=" + Actor +
                '}';
    }
}