package com.roomdb.roomdb;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface UserDao {

    @Insert
    void insertAll(User users);
}
