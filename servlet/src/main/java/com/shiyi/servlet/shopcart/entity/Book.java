package com.shiyi.servlet.shopcart.entity;

public class Book {
    private Integer id;

    private String title;

    private String author;

    private String pub;

    private Double price;

    private String img;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pub='" + pub + '\'' +
                ", price=" + price +
                ", img='" + img + '\'' +
                '}';
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Book() {
    }

    public Book(Integer id, String title, String author, String pub, Double price, String img) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pub = pub;
        this.price = price;
        this.img = img;
    }
}
