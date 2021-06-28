package com.test.spring_boot.repository.entity;

/**
 * @description:
 * @author: TK
 * @time: 2021/6/28 下午12:31
 */
public class UserEntity {
    long id;
    String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
