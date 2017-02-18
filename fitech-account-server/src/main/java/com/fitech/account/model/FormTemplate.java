package com.fitech.account.model;

/**
 * Created by chun on 2017/2/18.
 */
public class FormTemplate extends ReportTemplate {

    @Override
    public Report createReport() {
        Report report =  new FormReport();
        report.setTemplate(this);
        return report;
    }
}
