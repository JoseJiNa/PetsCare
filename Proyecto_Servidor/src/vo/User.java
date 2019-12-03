/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.io.Serializable;

/**
 *
 * @author jjimenez
 */
public class User implements Serializable {

    private int userId;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String mail;
    private String phone;
    private int clincId;
    private int userType;

    public static final int OWNER = 1;
    public static final int VETDOC = 2;
    public static final int ADMIN = 3;

    public User(String username, String password, String name, String surname, String mail, String phone, int clincId, int userType) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.phone = phone;
        this.clincId = clincId;
        this.userType = userType;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getClincId() {
        return clincId;
    }

    public void setClincId(int clincId) {
        this.clincId = clincId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
