package com.muskyqueers.pantry.models;
public class ProductDTO {


    private Integer id;

    private String name;

    private Long date;

    private Long ex_date;

    public ProductDTO() {
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.date = product.getDate();
        this.ex_date = product.getEx_date();
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
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", ex_date=" + ex_date +
                '}';
    }
}

