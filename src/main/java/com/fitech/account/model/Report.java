package com.fitech.account.model;

import com.fitech.base.model.FTNamedObject;

import java.util.ArrayList;
import java.util.List;

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


    private List<ReportRow> rows;


    public List<ReportRow> getRows() {
        if (null == this.rows)
            this.rows = new ArrayList<ReportRow>();
        return rows;
    }

}
