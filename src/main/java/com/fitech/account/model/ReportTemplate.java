package com.fitech.account.model;

import com.fitech.base.model.FTNamedObject;

/**
 * Created by chun on 2017/2/16.
 */
public class ReportTemplate extends FTNamedObject {

    private ReportRowTemplate rowTemplate;

    public ReportRowTemplate getRowTemplate() {
        return rowTemplate;
    }

    public void setRowTemplate(ReportRowTemplate rowTemplate) {
        this.rowTemplate = rowTemplate;
    }

    private Report report;


    public Report generateReport() {
        this.report = new Report();
        this.report.setTemplate(this);
        return this.report;
    }
}
