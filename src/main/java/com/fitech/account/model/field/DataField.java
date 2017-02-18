package com.fitech.account.model.field;

import com.fitech.base.model.FTNamedObject;

/**
 * Created by chun on 2017/2/16.
 */
public abstract class DataField<T> extends FTNamedObject implements Cloneable{

    private T fieldValue;
    private FieldSqlType sqlType;
    private boolean visible;
    private boolean searchable;


    public T getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(T fieldValue) {
        this.fieldValue = fieldValue;
    }


    public FieldSqlType getSqlType() {
        return sqlType;
    }

    public void setSqlType(FieldSqlType sqlType) {
        this.sqlType = sqlType;
    }


    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isSearchable() {
        return searchable;
    }

    public void setSearchable(boolean searchable) {
        this.searchable = searchable;
    }

    public abstract boolean validate();

    @Override
    public DataField<T> clone() throws CloneNotSupportedException {
        DataField<T> newField = (DataField<T>) super.clone();


        try {
            newField.setFieldValue((T)newField.getSqlType().getDefaultLangObject());

        } catch (Exception e) {
            return null;
        }
        return newField;

    }

}
