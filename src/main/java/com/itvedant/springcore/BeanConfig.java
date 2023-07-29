package com.itvedant.springcore;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.itvedant.extra.Book;

@Configuration 
public class BeanConfig {
    @Bean //used on pre-defined classes only
    public LocalDate today(){
        System.out.println("LocalDate Object Created");
        return LocalDate.now();
    }
    @Bean //used on pre-defined classes only
    public LocalTime current(){
        System.out.println("LocalTime Object created");
        return LocalTime.now();
    }

    @Bean("book1")
    @Primary //default bean to be consumed
    public Book createbook(){
        System.out.println("Book 1 object created");
        return new Book("harry potter", "abc", 500.00);
    }

    @Bean("book2")
    public Book getbook(){
        System.out.println("Book 2 object created");
        return new Book("twilight", "xyz", 200.00);
    }
}
