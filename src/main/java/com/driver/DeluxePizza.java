package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.deluxePizza=true;
        // your code goes here
        super.price+=80;
        if(isVeg==true)
            super.price+=70;
        else
            super.price+=120;
    }
}
