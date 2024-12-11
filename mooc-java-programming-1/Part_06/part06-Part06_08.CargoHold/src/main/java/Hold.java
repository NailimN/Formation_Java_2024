/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author milia
 */
public class Hold {
     private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        suitcases = new ArrayList();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(totalWeight() <= maximumWeight - suitcase.totalWeight()){
        suitcases.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Suitcase suitcase : suitcases){
            weight = weight + suitcase.totalWeight();
        }
        return weight;
    }
    
    public String toString(){
       String suitcaseS = " suitcase";
       
       if (suitcases.isEmpty()){
           return "no items (0 kg)";
       }
       
       if (suitcases.size() > 1){
           suitcaseS = " suitcases";
       }
       
       return suitcases.size() + suitcaseS + " (" + totalWeight() + "kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
    
}
