package com.itvedant.extra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private Book book;
    private Student student;
    
    //constructor based bean injection
    public Customer(@Qualifier("book1") Book book){
        System.out.println("Customer Object Created");
        this.book=book;
    }
    //method
    public void checkBook(){
        System.out.println(book);
    }
    @Autowired //setter-based bean injection
    public void setStudent(Student stud){
        //System.out.println("setStudent Method Called");
        this.student=stud;
    }
}
