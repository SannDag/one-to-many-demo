
package com.sanndag.jpatest.logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String lastname;
    
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    
    @OneToOne
    private Career career;

    public Student() {
    }

    public Student(int id, String name, String lastname, Date birthdate, Career career) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.career = career;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }
    
    

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", lastname=" + lastname + ", birthdate=" + birthdate + '}';
    }
    
    
    
    
    
}
