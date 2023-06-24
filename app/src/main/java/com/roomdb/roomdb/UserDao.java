package com.roomdb.roomdb;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface UserDao {

    @Insert
    //void insertUser(User users);

    void insertUser(int id, String name, String email, String contact);
}
