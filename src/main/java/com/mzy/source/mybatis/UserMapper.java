package com.mzy.source.mybatis;

public interface UserMapper {
    public void insertUser(User user);

    public User getUser(Integer id);
}
