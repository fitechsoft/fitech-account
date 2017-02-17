package com.fitech.account.model.field;

import com.fitech.base.model.FTNamedObject;
import com.fitech.base.model.FTObject;

/**
 * Created by chun on 2017/2/16.
 */
public abstract class FAField<T> extends FTNamedObject implements Cloneable{

    private T fieldValue;
    private FAFieldSqlType sqlType;
    private boolean visible;
    private boolean searchable;


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
    public FAField<T> clone() throws CloneNotSupportedException {
        FAField<T> newField = (FAField<T>) super.clone();


        try {
            newField.setFieldValue((T)newField.getSqlType().getDefaultLangObject());

        } catch (Exception e) {
            return null;
        }
        return newField;

    }

}
