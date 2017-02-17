package com.fitech.base.model;

import com.fitech.base.model.FTObject;

/**
 * Created by chun on 2017/2/17.
 */
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

    private String name;
    private String description;

}
