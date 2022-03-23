package com.detroitlabs.BookTracker.model;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int numOfPages;
    private int id;

    public Book(String title, String author, String genre, int numOfPages, int id) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numOfPages = numOfPages;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = id;
    }
}
