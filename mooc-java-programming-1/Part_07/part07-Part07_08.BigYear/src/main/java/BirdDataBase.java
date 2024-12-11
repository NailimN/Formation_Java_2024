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
public class BirdDataBase {
    private ArrayList<Bird> birds;
    
    public BirdDataBase(){
        this.birds = new ArrayList();
    }
    
    public void addBird(String name, String latinName){
        birds.add(new Bird(name, latinName));
    }
    
    public void printAll(){
        for (Bird bird : birds){
            System.out.println(bird.toString());
        }
    }
    
    public void printOne(String name){
   
        for (Bird bird : birds){
            if (bird.getName().equals(name)){
                System.out.println(bird.toString());
            }
        }
    }
    
    public void addObservation(String name){
        boolean founded = false;
        for (Bird bird : birds){
            if (bird.getName().equals(name)){
                bird.addObservation();
                founded = true;
            }
        }
        
        if(!founded){
            System.out.println("Not a bird!");
        }
        
    }
    
    
}
