/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milia
 */
public class Timer {
    
    ClockHand seconds = new ClockHand(60);
    ClockHand hundrethsOfSecond = new ClockHand(100);
    
    public void advance() {
        this.hundrethsOfSecond.advance();

        if (this.hundrethsOfSecond.value() == 0) {
            this.seconds.advance();

        }
    }
    
    public String toString(){
        return seconds + ":" + hundrethsOfSecond;
    }
    
    
    
}
