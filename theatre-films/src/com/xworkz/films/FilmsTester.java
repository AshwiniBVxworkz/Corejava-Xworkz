package com.xworkz.films;
import java.util.Scanner;
public class FilmsTester {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Films film=new Films();
        for(int i=0;i<film.films.length;i++){
          System.out.println("Enter film names");
          String filmName=sc.next();
          film.addFilmName(filmName);
        }
        film.getFilmName();

    }
}
