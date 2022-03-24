package com.detroitlabs.BookTracker.model;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int numOfPages;
    private String imageName;

    public Book(String title, String author, String genre, int numOfPages, String imageName) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numOfPages = numOfPages;
        this.imageName = imageName;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
