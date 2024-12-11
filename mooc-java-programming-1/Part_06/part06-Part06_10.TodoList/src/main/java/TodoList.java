
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milia
 */
public class TodoList {
    private ArrayList<String> list;

    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void add(String word) {
        this.list.add(word);
    }
    
    public void remove(int index) {
        this.list.remove(index - 1);
    }
    
    public void print(){
        for (String task : list){
            System.out.println((list.indexOf(task) + 1) + ": " + task);
        }
    }
    
}
