package com.xworkz.films;

public class Films {
        String films[]=new String[5];
        int index;
        public boolean addFilmName(String filmName){
            boolean isAdded=false;
            if(filmName!=null && index< films.length){
                isAdded=true;
                films[index++]=filmName;
            }return isAdded;
        }
        public void getFilmName(){
            for(int i=0;i< films.length;i++){
                System.out.println(films[i]);
            }
        }


}
