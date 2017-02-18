package com.fitech.account.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by chun on 2017/2/16.
 */
@Entity
public class LineReportTemplate extends ReportTemplate {

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "LINETEMPLATE_ID")
    private LineTemplate lineTemplate;

    public LineTemplate getLineTemplate() {
        if (null == lineTemplate)
            lineTemplate = new LineTemplate();
        return lineTemplate;
    }

    public void setLineTemplate(LineTemplate lineTemplate) {
        this.lineTemplate = lineTemplate;
    }

    @Override
    public LineReport createReport() {
        LineReport report = new LineReport();
        report.setTemplate(this);
        return report;
    }
}
