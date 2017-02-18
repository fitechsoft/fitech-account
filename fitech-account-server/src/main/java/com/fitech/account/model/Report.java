package com.fitech.account.model;

import com.fitech.base.model.FTNamedObject;

/**
 * Created by chun on 2017/2/16.
 */
public class Report extends FTNamedObject {

    private ReportTemplate template;

    public ReportTemplate getTemplate() {
        return template;
    }

    public void setTemplate(ReportTemplate template) {
        this.template = template;
    }



}
