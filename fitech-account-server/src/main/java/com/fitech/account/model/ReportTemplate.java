package com.fitech.account.model;

import com.fitech.base.model.FTNamedObject;

import javax.persistence.MappedSuperclass;

/**
 * Created by chun on 2017/2/18.
 */
@MappedSuperclass
public abstract class ReportTemplate extends FTNamedObject {

    public abstract Report createReport();

}
