package com.fitech.account.item;

/**
 * Created by chun on 2017/2/17.
 */
public class GenericDateItem extends DateItem {

    @Override
    public boolean validate() {
        return (null != this.getFieldValue());
    }
}
