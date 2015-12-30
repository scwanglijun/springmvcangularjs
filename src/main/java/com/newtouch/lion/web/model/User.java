package com.newtouch.lion.web.model;

import java.io.Serializable;

/**
 * Created by wanglijun on 15/12/26.
 */
public class User  implements Serializable {

    /**序列化*/
    private static final long serialVersionUID = 6629905036871731963L;

    private  Integer  id;

    private  String  username;

    public User() {
        super();
    }

    public User(String username, Integer id) {
        this.username = username;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
