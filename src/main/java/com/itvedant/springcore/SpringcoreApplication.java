package com.itvedant.springcore;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.itvedant.extra.Book;
import com.itvedant.extra.Customer;

@SpringBootApplication //(@EnableAutoConfiguration, @ComponentScan, @Configuration)
//defining different packages to be scanned
@ComponentScan(basePackages = {"com.itvedant.*"})
public class SpringcoreApplication implements CommandLineRunner{

	@Autowired //Field-Base Bean Injection 
	Employee employee;

	@Autowired //Field-Base Bean Injection 
	LocalDate today;

	@Autowired //Field-Base Bean Injection
	LocalTime current;

	@Autowired //Field-Base Bean Injection
	Book book1;

	@Autowired 
	@Qualifier("book2")
	Book book2;

	@Autowired
	Customer cust;

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employee.working();
		System.out.println(today);
		System.out.println(current);
		System.out.println(book1);
		System.out.println(book2);
		cust.checkBook();
		cust.setStudent(null);
	}
}
