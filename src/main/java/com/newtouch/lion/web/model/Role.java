package com.newtouch.lion.web.model;

import java.io.Serializable;

/**
 * Created by wanglijun on 15/12/26.
 */
public class Role  implements Serializable {
    private Integer  id;

    private String   name;

    private boolean checked=false;

    public Role() {
    }

    public Role(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
