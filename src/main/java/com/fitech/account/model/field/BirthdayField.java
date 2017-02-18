package com.fitech.account.model.field;

import java.util.Date;

/**
 * Created by chun on 2017/2/17.
 */
public class BirthdayField extends DateField {

    @Override
    public boolean validate() {
        if (this.getFieldValue().after(new Date())) {
            return false;
        }
        return true;
    }
}
