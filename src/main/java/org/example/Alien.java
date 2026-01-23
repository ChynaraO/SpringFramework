package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;
    @Autowired
    @Qualifier("desktop")
    private Computer com;


    public Alien(){
//        System.out.println("Object is created");
    }
//    public Alien(int age, Laptop lap){
//        this.lap = lap;
//        this.age = age;
//    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
//        System.out.println("setter is being called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
//    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
