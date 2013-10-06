package com.vettox.api.entity;

import java.util.Date;

/**
 * The interface IUser.
 * <p/>
 * User: Vitaliy
 * Date: 04.07.13
 */
public interface IUser {


    String getUserUid();

    void setUserUid(String userUid);

    String getUserEmail();

    void setUserEmail(String userEmail);

    String getPassword();

    void setPassword(String password);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getCity();

    void setCity(String city);

    Date getBirthDate();
}
