package com.company.fig01_Reflection;

import java.util.Date;

/**
 * Created by mega on 28.09.2016.
 */
public class Student {

    private long id;
    private String name;
    private Date birth;

    public Student() {
    }

    public Student(long id, String name, Date birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
