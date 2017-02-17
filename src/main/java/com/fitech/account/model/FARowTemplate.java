package com.fitech.account.model;

import com.fitech.account.model.field.FAField;
import com.fitech.base.model.FTNamedObject;

import java.util.List;


/**
 * Created by chun on 2017/2/16.
 */
public class FARowTemplate extends FTNamedObject {

    private List<FAField> fields;

    public List<FAField> getFields() {
        return fields;
    }

    public void setFields(List<FAField> fields) {
        this.fields = fields;
    }

    public void addFiled(FAField field) {
        this.fields.add(field);
    }

    public FARow generateRowInstance() throws RowInstanceGenerationException {

        //TODO

        FARow newRow = new FARow(); //TODO: Should use factory pattern

        try {
            for (FAField field : fields) {

                newRow.addField(field.clone());
            }
        } catch (CloneNotSupportedException e) {
            throw new RowInstanceGenerationException();
        }

        return newRow;

    }

}
