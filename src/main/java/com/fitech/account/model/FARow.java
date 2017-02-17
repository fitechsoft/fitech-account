package com.fitech.account.model;

import com.fitech.account.model.field.FAField;
import com.fitech.base.model.FTNamedObject;
import com.fitech.base.model.FTObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chun on 2017/2/16.
 */
public class FARow extends FTNamedObject{

    private List<FAField> fields;


    public List<FAField> getFields() {
        return fields;
    }

    public void setFields(List<FAField> fields) {
        this.fields = fields;
    }


    public void addField(FAField field){
        if (null == this.fields)
            this.fields = new ArrayList<FAField>();

        this.fields.add(field);
    }

}
