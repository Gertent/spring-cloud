package com.gertent.bean;

/**
 * @Author wyf
 * @Date 2019/1/3 9:29
 * @Desc
 * @Version 1.0
 */
public class Man {
    private String name;
    private String age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man [name=" + name + ", age=" + age + "]";
    }


}
