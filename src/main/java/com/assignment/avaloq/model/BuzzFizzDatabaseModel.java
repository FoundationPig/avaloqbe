package com.assignment.avaloq.model;

import org.hibernate.annotations.Entity;

import javax.persistence.Id;

@Entity
public class BuzzFizzDatabaseModel {

    @Id
    private String id;
    private String className;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
