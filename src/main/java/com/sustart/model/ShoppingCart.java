package com.sustart.model;

public class ShoppingCart {
    private Integer id;

    private Integer cartId;

    private String dishesId;

    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public String getDishesId() {
        return dishesId;
    }

    public void setDishesId(String dishesId) {
        this.dishesId = dishesId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}