package com.example.dsvendas.dto;

import com.example.dsvendas.entities.Seller;

import java.io.Serializable;

public class SalesSumDTO implements Serializable {
    private String SellerName;
    private Double sum;

    public SalesSumDTO(){};

    public SalesSumDTO(Seller seller, Double sum) {
        SellerName = seller.getName();
        this.sum = sum;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setSellerName(String sellerName) {
        SellerName = sellerName;
    }
}
