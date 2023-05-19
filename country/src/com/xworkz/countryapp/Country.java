package com.xworkz.countryapp;

public class Country {
    private int countryId;
    private String countryCode;
    private String CountryName;
    private  int noOfStates;
    private double population;

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setNoOfStates(int noOfStates) {
        this.noOfStates = noOfStates;
    }

    public int getNoOfStates() {
        return noOfStates;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getPopulation() {
        return population;
    }
}
