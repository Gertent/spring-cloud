package com.gertent.feign.entity;

/**
 * Created by wyf on 2017/8/8.
 */
public class User {
    public User(){}

    public User(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;
    private Integer age;

    @Override
    public String toString(){
        return "name="+name+",age="+age;
    }
}
