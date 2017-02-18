package com.fitech.account.item;

import com.fitech.base.model.FTNamedObject;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/**
 * Created by chun on 2017/2/16.
 */

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class DataItem<T> extends FTNamedObject implements Cloneable{

    private T fieldValue;
    private ItemSqlType sqlType;
    private boolean visible;
    private boolean searchable;


    public T getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(T fieldValue) {
        this.fieldValue = fieldValue;
    }


    public ItemSqlType getSqlType() {
        return sqlType;
    }

    public void setSqlType(ItemSqlType sqlType) {
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
    public DataItem<T> clone() throws CloneNotSupportedException {
        DataItem<T> newField = (DataItem<T>) super.clone();


        try {
            newField.setFieldValue((T)newField.getSqlType().getDefaultLangObject());

        } catch (Exception e) {
            return null;
        }
        return newField;

    }

}
