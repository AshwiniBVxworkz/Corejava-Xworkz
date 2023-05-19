package com.xworkz.countryapp;
import java.util.Scanner;
public class CountryTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Country Id");
        int countryId= sc.nextInt();
        System.out.println("Enter Country code");
        String countryCode=sc.next();
        System.out.println("Enter Country Name");
        String CountryName= sc.next();
        System.out.println("Enter Number of states");
        int noOfStates= sc.nextInt();
        System.out.println("Enter population");
        double population=sc.nextDouble();
        Country country =new Country();
        country.setCountryId(countryId);
        country.setCountryCode(countryCode);
        country.setCountryName(CountryName);
        country.setNoOfStates(noOfStates);
        country.setPopulation(population);
        System.out.println("Country Id:"+country.getCountryId());
        System.out.println("Country Code:"+country.getCountryCode());
        System.out.println("Country Name:"+country.getCountryName());
        System.out.println("Country-Number of states: "+country.getNoOfStates());
        System.out.println("Country-population:"+country.getPopulation()+"in billion");

    }
}
