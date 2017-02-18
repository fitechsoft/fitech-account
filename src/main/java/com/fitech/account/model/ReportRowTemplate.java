package com.fitech.account.model;

import com.fitech.account.model.field.DataField;
import com.fitech.base.model.FTNamedObject;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by chun on 2017/2/16.
 */
public class ReportRowTemplate extends FTNamedObject {

    private List<DataField> fields;

    public List<DataField> getFields() {
        return fields;
    }

    public void setFields(List<DataField> fields) {
        this.fields = fields;
    }

    public void addFiled(DataField field) {
        if (null == this.fields)
            this.fields = new ArrayList<DataField>();

        this.fields.add(field);
    }

    public ReportRow generateRowInstance() throws RowInstanceGenerationException {

        //TODO

        ReportRow newRow = new ReportRow(); //TODO: Should use factory pattern

        try {
            for (DataField field : fields) {

                newRow.addField(field.clone());
            }
        } catch (CloneNotSupportedException e) {
            throw new RowInstanceGenerationException();
        }

        return newRow;

    }

}
