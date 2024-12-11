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
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        items = new ArrayList();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if(totalWeight() <= maximumWeight - item.getWeight()){
        items.add(item);
        }
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Item item : items){
            weight = weight + item.getWeight();
        }
        return weight;
    }
    
    public String toString(){
       String itemS = " item";
       
       if (items.isEmpty()){
           return "no items (0 kg)";
       }
       
       if (items.size() > 1){
           itemS = " items";
       }
       
       return items.size() + itemS + " (" + totalWeight() + "kg)";
    }
    
    public void printItems(){
        for(Item item : items){
            System.out.println(item.getName() + " (" + item.getWeight() + "kg)");
        }
    }
    
    public Item heaviestItem() {
        int heaviestWeight = 0;
        Item heaviest = null;
        for (Item item : items) {
            if (heaviestWeight < item.getWeight()) {
                heaviestWeight = item.getWeight();
                heaviest = item;
            }
        }
        return heaviest;
    }
}
