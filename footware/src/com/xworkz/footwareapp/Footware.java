package com.xworkz.footwareapp;

public class Footware {
    private int footwareId;
    private String brandName;
    private int size;
    private String type;
    private  String materialType;
    private int price;

    public void  setFootwareId(int footwareId) {
     this.footwareId=footwareId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFootwareId() {
        return footwareId;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getMaterialType() {
        return materialType;
    }

    public int getPrice() {
        return price;
    }
}
