package com.fitech.account.model.field;

import java.util.Date;

/**
 * Created by chun on 2017/2/17.
 */
public enum FieldSqlType {

    DATE("DATE"),
    VARCHAR("VARCHAR"),
    INTEGER("INTEGER"),
    DOUBLE("DOUBLE");

    private String typeString;

    FieldSqlType(String typeString) {
        this.typeString = typeString;
    }

    public Class<?> getLangType() {

        switch (this) {
            case DATE:
                return Date.class;
            case VARCHAR:
                return String.class;
            case INTEGER:
                return Integer.class;
            case DOUBLE:
                return Double.class;
            default:
                return Object.class;
        }
    }

    public Object getLangObject(String stringValue) {

        switch (this) {
            case DATE:
                //TODO: it's not right here yet
                return Date.parse(stringValue);
            case VARCHAR:
                return stringValue;
            case INTEGER:
                return Integer.parseInt(stringValue);
            case DOUBLE:
                return Double.parseDouble(stringValue);
            default:
                return null;
        }
    }

    public Object getDefaultLangObject() {

        switch (this) {
            case DATE:
                //TODO: it's not right here yet
                return new Date();
            case VARCHAR:
                return "";
            case INTEGER:
                return 0;
            case DOUBLE:
                return 0.0;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return typeString;
    }
}
