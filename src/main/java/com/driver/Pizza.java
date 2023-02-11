package com.driver;

public class Pizza {
    private int price;
    private final Boolean isVeg;
    private String bill;

    private final int toppings;

    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAdded;
    private boolean isBillCreated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }else{
            this.price = 400;
            this.toppings = 120;
        }
        this.bill= "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            isCheeseAdded = true;
            this.price+= 80;
        }
    }

    public void addExtraToppings(){
        if(!isToppingAdded){
            isToppingAdded = true;
            this.price += this.toppings;
        }
    }

    public void addTakeaway() {
        if (!isTakeAdded){
            isTakeAdded = true;
            this.price += 20;
        }
    }

    public String getBill(){
        if(!isBillCreated){
            if(isCheeseAdded){
                this.bill += "Extra Cheese Added: 80"+"\n";
            }
            if(isToppingAdded){
                this.bill+= "Extra Toppings Added: "+this.toppings+"\n";
            }
            if(isTakeAdded){
                this.bill += "Paperbag Added: 20"+"\n";
            }
            this.bill+= "Total Price: "+this.price+"\n";
            isBillCreated = true;
            return this.bill;
        }
        return this.bill;
    }
}
