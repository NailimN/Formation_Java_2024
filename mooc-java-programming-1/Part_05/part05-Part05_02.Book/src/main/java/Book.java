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
    
    private String title;
    private String author;
    private int pages;
    
    public Book(String author, String title, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getName(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public String toString(){
        return author + ", " + title + ", " + pages + " pages";
    }
}
