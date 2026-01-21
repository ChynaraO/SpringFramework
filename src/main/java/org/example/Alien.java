package org.example;

public class Alien {

    private int age;
    public Alien(){
        System.out.println("Object is created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter is being called");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
    }
}
