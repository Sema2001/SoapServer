package org.sid.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
@XmlRootElement(name = "Etudiant")
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {

    String name;
    long id;
    int age;
    @XmlTransient
    double gpa;

    public Students(String name, long id, int age, double gpa) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    Students(){}

}
