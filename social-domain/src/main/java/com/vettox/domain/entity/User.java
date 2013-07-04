package com.vettox.domain.entity;

import com.vettox.api.entity.IUser;

import java.util.Date;

/**
 * The class User.
 * <p/>
 * User: Vitaliy
 * Date: 04.07.13
 */
public class User implements IUser {

    private String userUid;

    private String userEmail;

    private String password;

    private String firstName;

    private String lastName;

    private String city;

    private Date birthDate;

    private String photoFilename;

    private boolean isBanned;

    @Override
    public String getUserUid() {
        return userUid;
    }

    @Override
    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    @Override
    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhotoFilename() {
        return photoFilename;
    }

    public void setPhotoFilename(String photoFilename) {
        this.photoFilename = photoFilename;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }
}
