/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milia
 */
public class PaymentCard {
    
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }
    
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably(){
        if(this.balance >= 2.60){
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily(){
        if(this.balance >= 4.60){
            this.balance -= 4.60;
        }
    }
    
    public void addMoney(double amountAdded){
        if(amountAdded > 0 && this.balance <= 150 - amountAdded){
            this.balance += amountAdded;
        } else if (this.balance + amountAdded > 150){
            this.balance = 150;
        }
    }
    
    
}
