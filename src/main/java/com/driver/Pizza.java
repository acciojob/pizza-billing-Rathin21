package com.driver;

public class Pizza {

    int price;
    private Boolean isVeg;
    private String bill="";
    private boolean extraCheese=false;
    private boolean extraToppings=false;
    private boolean paperBag = false;
    boolean deluxePizza=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true)
            this.price=300;
        else
            this.price=400;
        // your code goes here
    }

    public int getPrice(){
        
        return price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese==true) 
            return;
        extraCheese=true;
        price +=80;

    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings==true) 
            return;
        extraToppings=true;
        if(isVeg==true)
            price +=70;
        else 
            price +=120;
    }

    public void addTakeaway(){
        // your code goes here
        if(paperBag==true) return;
        paperBag=true;
        price +=20;
    }

    public String getBill(){
        // your code goes here
        if(deluxePizza==true){
            if(isVeg==true)
                bill +="Base Price Of The Pizza: 450"+'\n';
            else
                bill +="Base Price Of The Pizza: 550"+'\n';
        }
        else{
            if(isVeg==true)
                bill +="Base Price Of The Pizza: 300"+'\n';
            else
                bill +="Base Price Of The Pizza: 400"+'\n';
        }
        if(extraCheese==true && deluxePizza==false)
            bill +="Extra Cheese Added: 80"+'\n';

        if(extraToppings==true && deluxePizza==false){
            if(isVeg==true)
                bill+="Extra Toppings Added: 70"+'\n';
            else
                bill+="Extra Toppings Added: 120"+'\n';
        }

        if(paperBag==true)
            bill +="Paperbag Added: 20"+'\n';
        
            bill +="Total Price:"+price;
        // else{
        //     if(paperBag==true && isVeg==true)
        //         bill +="Total Price: 470";
        //     else 
        //         bill += "Total Price: 570"; 
        
        return this.bill;
    }
}
