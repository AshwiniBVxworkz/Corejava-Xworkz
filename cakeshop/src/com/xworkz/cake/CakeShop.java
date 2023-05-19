package com.xworkz.cake;

public class CakeShop {
    private String cakeColor;
    private int cakeId;
    private String cakeShape;
    private String cakeFlavour;
    private double cakePrice;

    public void setCakeColor(String cakeColor) {
        this.cakeColor = cakeColor;
    }
    public String getCakeColor(){
        return cakeColor;
    }

    public  void setCakeId(int  cakeId) {
        this.cakeId = cakeId;
    }

    public double getCakeId() {
        return cakeId;
    }

    public void setCakeShape(String cakeShape) {
        this.cakeShape = cakeShape;
    }

    public String getCakeShape() {
        return cakeShape;
    }

    public void setCakeFlavour(String cakeFlavour) {
        this.cakeFlavour = cakeFlavour;
    }

    public String getCakeFlavour() {
        return cakeFlavour;
    }

    public void setCakePrice(double cakePrice) {
        this.cakePrice = cakePrice;
    }

    public double getCakePrice() {
        return cakePrice;
    }
}
