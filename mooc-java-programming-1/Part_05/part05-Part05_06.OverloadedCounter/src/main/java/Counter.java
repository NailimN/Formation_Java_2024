/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milia
 */
public class Counter {
    private int value;
    
    public Counter() {
        this(0);
    }
    
    public Counter(int startValue) {
        this.value = startValue;
    }
    
    public int value(){
        return value;
    }
    public void increase(int increaseBy){
            if(increaseBy >= 0){
                this.value = this.value + increaseBy;
            }
    }
    public void decrease(int decreaseBy){
        if(decreaseBy>= 0){
            this.value = this.value - decreaseBy;
        }
    }
    
    public void increase(){
        this.increase(1);
    }
    public void decrease(){
        this.decrease(1);
    }
    
}
