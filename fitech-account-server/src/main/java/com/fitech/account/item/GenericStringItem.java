package com.fitech.account.item;

/**
 * Created by chun on 2017/2/17.
 */
public class GenericStringItem extends StringItem {


    @Override
    public boolean validate(){
        return (null != this.getFieldValue());
    }
}
