package com.muskyqueers.pantry.models;

import javax.persistence.*;

@Entity
@Table(name = "\"Products\"")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private Long date;

    @Column(name = "ex_date")
    private Long ex_date;

    public Product() {
    }

    public Product(Integer id, String name, Long date, Long ex_date) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.ex_date = ex_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getEx_date() {
        return ex_date;
    }

    public void setEx_date(Long ex_date) {
        this.ex_date = ex_date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", ex_date=" + ex_date +
                '}';
    }
}
