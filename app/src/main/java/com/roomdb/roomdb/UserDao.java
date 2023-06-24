package com.roomdb.roomdb;

import androidx.room.Dao;

import androidx.room.Insert;

@Dao
public interface UserDao {

    //void insertUser(User users);

    @Insert
    void insertUser(User user);
}
