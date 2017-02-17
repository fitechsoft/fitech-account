package com.fitech.account.model.field;

import java.text.NumberFormat;

/**
 * Created by chun on 2017/2/17.
 */
public class FACurrencyField extends  FADoubleField {

    public static final Double BOUND_UPPER = 10000000000.0;
    public static final Double BOUND_LOWER = -10000000000.0;


    @Override
    public boolean validate() {
        return this.getFieldValue() > BOUND_LOWER && this.getFieldValue() < BOUND_UPPER;
    }

    public String getFormatted() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(this.getFieldValue());
    }
}
