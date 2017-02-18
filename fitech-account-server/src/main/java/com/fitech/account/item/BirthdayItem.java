package com.fitech.account.item;

import java.util.Date;

/**
 * Created by chun on 2017/2/17.
 */
public class BirthdayItem extends DateItem {

    @Override
    public boolean validate() {
        if (this.getFieldValue().after(new Date())) {
            return false;
        }
        return true;
    }
}
