package com.fitech.account.model;

import com.fitech.base.model.FTNamedObject;

/**
 * Created by chun on 2017/2/16.
 */
public class FAReportTemplate extends FTNamedObject {

    private FARowTemplate rowTemplate;

    public FARowTemplate getRowTemplate() {
        return rowTemplate;
    }

    public void setRowTemplate(FARowTemplate rowTemplate) {
        this.rowTemplate = rowTemplate;
    }

    private FAReport report;


    public FAReport generateReport() {
        this.report = new FAReport();
        this.report.setTemplate(this);
        return this.report;
    }
}
