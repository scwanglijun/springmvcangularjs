package com.newtouch.lion.web.model;

import java.io.Serializable;

/**
 * Created by wanglijun on 15/12/26.
 */
public class Right  implements Serializable{

    private static final long serialVersionUID = -7627126954472830572L;

    private Integer id;

    private String name;

    public Right() {
    }

    public Right(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
