package com.springbootdatarest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "datarest_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String title;
    private String content;
    private String author;
    private Integer pages;

    public Book() {
    }

    public Book(Integer id, String title, String content, String author, Integer pages) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
