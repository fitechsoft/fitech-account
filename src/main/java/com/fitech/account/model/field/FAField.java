package com.fitech.account.model.field;

import com.fitech.base.model.FTObject;

/**
 * Created by chun on 2017/2/16.
 */
public abstract class FAField<T> extends FTObject implements Cloneable{

    private String fieldName;
    private T fieldValue;
    private FAFieldSqlType sqlType;
    private String description;
    private boolean visible;
    private boolean searchable;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }


    public T getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(T fieldValue) {
        this.fieldValue = fieldValue;
    }


    public FAFieldSqlType getSqlType() {
        return sqlType;
    }

    public void setSqlType(FAFieldSqlType sqlType) {
        this.sqlType = sqlType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    protected FAField<T> clone() throws CloneNotSupportedException {
        FAField<T> newField = (FAField<T>) super.clone();


        try {
            newField.setFieldValue((T)newField.getSqlType().getDefaultLangObject());

        } catch (Exception e) {
            return null;
        }
        return newField;

    }

}
