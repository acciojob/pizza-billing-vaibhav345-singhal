package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private String cheesePart= "";
    private String toppingPart = "";
    private String takeAwayPart = "";

    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        this.bill= "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseAdded) return;
        this.isCheeseAdded = true;
        this.price+= 80;
        this.cheesePart = "Extra Cheese Added: 80" + "\n";
    }

    public void addExtraToppings(){
        if(isToppingAdded) return;
        this.isToppingAdded = true;
        if(this.isVeg) this.price += 70;
        else this.price += 120;
        this.toppingPart += "Extra Toppings Added: 70" + "\n";
    }

    public void addTakeaway(){
        if(isTakeAway) return;
        this.isTakeAway = true;
        this.price += 20;
        this.takeAwayPart += "Paperbag Added: 20" + "\n";
    }

    public String getBill(){
        this.bill += this.cheesePart + this.toppingPart + this.takeAwayPart;
        this.bill+= "Total Price: "+this.price;
        return this.bill;
    }
}
