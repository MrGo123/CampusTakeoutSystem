package com.sustart.model;

public class Menu {
    private String dishesId;

    private String name;

    private String shopId;

    private Float price;

    private String photoName;

    private String classify;

    public String getDishesId() {
        return dishesId;
    }

    public void setDishesId(String dishesId) {
        this.dishesId = dishesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }
}