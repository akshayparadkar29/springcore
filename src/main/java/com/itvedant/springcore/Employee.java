package com.itvedant.springcore;

import org.springframework.stereotype.Component;

//by using @Component SpringBoot will create the object of class Employee
//and it will be maintained in IoC Container
@Component("emp") //we can add custom bean names using -> ()
public class Employee {
    public Employee(){
        System.out.println("Employee Object Created");
    }
    //method
    public void working(){
        System.out.println("Working");
    }
}

