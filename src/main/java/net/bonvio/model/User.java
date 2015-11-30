package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.javafx.geom.transform.Identity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 */

@Entity
public class User implements Serializable {

/*    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String login;

    @JsonIgnore
    public String password;

    @OneToOne
    @JsonIgnore
    @Transient
    public Employee employee;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }*/

    private Integer id;
    private String login;
    private String password;
    private Employee employee;


    public User() {
    }

    public User(String login, String password, Employee employee) {
        this.login = login;
        this.password = password;
        this.employee = employee;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToOne
    @JsonIgnore
    @Transient
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

