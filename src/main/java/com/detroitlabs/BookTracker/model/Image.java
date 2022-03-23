package com.detroitlabs.BookTracker.model;

public class Image {
    private String imageName;
    private Integer id;

    public Image(String imageName, Integer id) {
        this.imageName = imageName;
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
