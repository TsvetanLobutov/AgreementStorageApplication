package com.netcracer.agreementstorage.domain.model;

import java.io.Serializable;
import java.util.List;

public abstract class Parent implements Serializable {
    protected String name;
    protected List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
