package com.fitech.account.model;

import com.fitech.account.model.field.FAField;
import com.fitech.base.model.FTObject;

/**
 * Created by chun on 2017/2/16.
 */
public abstract class FAFieldType extends FTObject {

    public abstract FAField generateFieldInstance();

}
