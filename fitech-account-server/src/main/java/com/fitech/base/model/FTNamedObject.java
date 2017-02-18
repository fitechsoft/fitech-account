package com.fitech.base.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by chun on 2017/2/17.
 */
@MappedSuperclass
public class FTNamedObject extends FTObject {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String description;

}
