package com.fitech.account.model;

import com.fitech.base.model.FTObject;

import java.util.List;


/**
 * Created by chun on 2017/2/16.
 */
public class FARowTemplate extends FTObject {

    private List<FAFieldType> typedFields;

    public List<FAFieldType> getTypedFields() {
        return typedFields;
    }

    public void setTypedFields(List<FAFieldType> typedFields) {
        this.typedFields = typedFields;
    }


    public FARow generateRowInstance(){

        //TODO

        FARow newRow = new FARow(); //TODO: Should use factory pattern

        for (FAFieldType fieldType: typedFields){
            newRow.addField(fieldType.generateFieldInstance());
        }

        return newRow;

    }

}
