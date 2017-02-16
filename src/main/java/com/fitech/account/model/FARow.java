package com.fitech.account.model;

import com.fitech.base.model.FTObject;

import java.util.List;

/**
 * Created by chun on 2017/2/16.
 */
public class FARow extends FTObject{

    private List<FAField> fields;


    public List<FAField> getFields() {
        return fields;
    }

    public void setFields(List<FAField> fields) {
        this.fields = fields;
    }


    public void addField(FAField field){
        this.fields.add(field);
    }

}
