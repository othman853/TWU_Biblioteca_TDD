package com.twu.biblioteca.model;


public class Book {

    private int code;
    private String name;
    private String authors;
    private boolean available;
    private int yearPublished;

    private String displayFormat;

    public Book(int code, String name, String authors, boolean available, int yearPublished) {
        this.code = code;
        this.name = name;
        this.authors = authors;
        this.available = available;
        this.yearPublished = yearPublished;

        displayFormat = "[code]: [name] by [author]. Published in [year]";
    }

    public Book() {
        displayFormat = "[code]: [name] by [authors]. Published in [yearPublished]";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getDisplayFormat() {
        return displayFormat;
    }

    @Override
    public String toString() {

        return displayFormat
                .replace("[code]", Integer.toString(code))
                .replace("[name]", name)
                .replace("[authors]", authors)
                .replace("[yearPublished]", Integer.toString(yearPublished));

    }
}
