/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milia
 */
public class Book {
    
    String name;
    int publicationYear;
    int pages;
    
    public Book(String name, int publicationYear, int pages){
        this.name = name;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPublicationYear(){
        return this.publicationYear;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
