/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milia
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String toString(){
        return identifier + ": " + name;
    }
    
    public String getIdentifier(){
        return identifier;
    }
    
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Item)) {
            return false;
        }

        // convert the object into a Person object
        Item comparedItem = (Item) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(comparedItem.name) &&
            this.identifier.equals(comparedItem.identifier)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
}
