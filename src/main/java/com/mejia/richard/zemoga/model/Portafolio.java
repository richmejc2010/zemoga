package com.mejia.richard.zemoga.model;

import javax.persistence.*;

@Entity
@Table(name = "portfolio")
public class Portafolio {
    private int idPortafolio;
    private String description;
    private String imageUrl;
    private String twitterUserName;
    private String title;

    public Portafolio(int idPortafolio, String description, String imageUrl, String twitterUserName, String title) {
        this.idPortafolio = idPortafolio;
        this.description = description;
        this.imageUrl = imageUrl;
        this.twitterUserName = twitterUserName;
        this.title = title;
    }

    public Portafolio() {
    }

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdPortafolio() {
        return idPortafolio;
    }

    public void setIdPortafolio(int idPortafolio) {
        this.idPortafolio = idPortafolio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTwitterUserName() {
        return twitterUserName;
    }

    public void setTwitterUserName(String twitterUserName) {
        this.twitterUserName = twitterUserName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
