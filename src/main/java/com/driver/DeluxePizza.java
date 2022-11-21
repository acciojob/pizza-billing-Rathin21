package com.driver;

class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.price+=80;
        if(isVeg==true)
            super.price+=70;
        else
            super.price+=120;
    }
}
