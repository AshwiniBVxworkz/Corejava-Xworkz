package com.xworkz.mobileshopapp;

public class Mobile {
    String mobileNames[]=new String[5];
    int index;
    public boolean addMobileName(String mobileName) {
        boolean isAdded = false;
        if (mobileName != null && index < mobileNames.length) {
            mobileNames[index++] = mobileName;
            isAdded = true;
        } else {
            System.out.println("Cannot add mobile name a size exceeds");
        }
        return isAdded;
    }
        public void getMobileName() {
            for (int i=0;i< mobileNames.length;i++) {
                System.out.println(mobileNames[i]);
            }
        }
}
