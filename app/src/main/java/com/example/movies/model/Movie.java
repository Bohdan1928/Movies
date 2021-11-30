package com.example.movies.model;

public class Movie {
    private String title;
    private String posterURL;
    private String  year;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String  year) {
        this.year = year;
    }
}
