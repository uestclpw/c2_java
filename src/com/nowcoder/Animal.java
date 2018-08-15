package com.nowcoder;

public class Animal implements Talking {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Animal(String name, String age){
        this.name=name;
        this.age=age;

    }

    @Override
    public void say() {
        System.out.println("This is Animal");
    }
}
