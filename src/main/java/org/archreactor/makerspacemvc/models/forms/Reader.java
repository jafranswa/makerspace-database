package org.archreactor.makerspacemvc.models.forms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reader {

    private String name;

    @Id
    @GeneratedValue
    private Integer Id;

    //constructors
    public Reader() { } //used by Hibernate in the process of creating objects from data retrieved from the database

    public Reader(String name) {
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
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
