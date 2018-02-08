package org.archreactor.makerspacemvc.models.forms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {

    private String name;

    @Id
    @GeneratedValue
    private Integer id;

    //constructors
    public Member () {} //used by Hibernate in the process of creating objects from data retrieved from the database

    public Member(String name) {
        this.name = name;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
