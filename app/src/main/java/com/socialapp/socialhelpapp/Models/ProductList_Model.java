package com.socialapp.socialhelpapp.Models;

public class ProductList_Model {
    private String productname, productprice, productimage;

    public ProductList_Model() {
    }

    public ProductList_Model(String productname, String productimage, String productprice) {
        this.productname = productname;
        this.productimage = productimage;
        this.productprice = productprice;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductimage() {
        return productimage;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }
}
