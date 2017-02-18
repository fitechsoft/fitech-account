package com.fitech.account.model.field;

/**
 * Created by chun on 2017/2/17.
 */
public class GenericDateField extends DateField {

    @Override
    public boolean validate() {
        return (null != this.getFieldValue());
    }
}
