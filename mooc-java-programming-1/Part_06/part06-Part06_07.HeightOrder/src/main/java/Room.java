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
public class Room {

    private ArrayList<Person> list;

    public Room() {
        list = new ArrayList();
    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return list;
    }

    public Person shortest() {
        int shortestHeight = 300;
        Person shortest = null;
        for (Person person : list) {
            if (shortestHeight > person.getHeight()) {
                shortestHeight = person.getHeight();
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        Person shortest = shortest();
        list.remove(shortest);
        return shortest;
    }
}