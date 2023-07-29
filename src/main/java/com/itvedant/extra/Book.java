package com.itvedant.extra;

public class Book {
    private String Name;
    private String Author;
    private Double Price;

    public Book(String name,String author,Double price){
        this.Name=name;
        this.Author=author;
        this.Price=price;
    }

    @Override
    public String toString() {
        return "Book [Name=" + Name + ", Author=" + Author + ", Price=" + Price + "]";
    }

    
}
