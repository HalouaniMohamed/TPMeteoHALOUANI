package com.example.halouani_mohamed_tp3.model;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    public Address() {
    }

    public Address(Long id, Date creation, String content, String author) {
        this.id = id;
        this.creation = creation;
        this.content = content;
        this.author = author;
    }

    private Date creation;
    private String content;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
