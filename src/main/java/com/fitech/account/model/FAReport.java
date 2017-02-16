package com.fitech.account.model;

import com.fitech.base.model.FTObject;

import java.util.List;

/**
 * Created by chun on 2017/2/16.
 */
public abstract class FAReport extends FTObject {

    private FAReportTemplate template;


    public FAReportTemplate getTemplate() {
        return template;
    }

    public void setTemplate(FAReportTemplate template) {
        this.template = template;
    }


    private List<FARow> rows;


    public List<FARow> getRows() {
        return rows;
    }

}
