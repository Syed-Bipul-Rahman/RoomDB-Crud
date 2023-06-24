package com.roomdb.roomdb;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    public int uid;
    @ColumnInfo(name = "name")
    public String username;
    @ColumnInfo(name = "eamil")
    public String email;
    @ColumnInfo(name = "contact")
    public String contact;


}
