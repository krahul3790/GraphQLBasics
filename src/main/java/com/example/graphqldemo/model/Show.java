package com.example.graphqldemo.model;

public class Show {
    private final String title;
    private final Integer releaseYear;

    public Show(String title, Integer releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getReleaseYear() {
        return this.releaseYear;
    }
}
