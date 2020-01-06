package com.mzy.source.mybatis;

/**
 * @author ：mizhaoya
 * @date ：2020/1/6 16:00
 * @description：
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public User() {
        super();
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return this.age;
    }
}
