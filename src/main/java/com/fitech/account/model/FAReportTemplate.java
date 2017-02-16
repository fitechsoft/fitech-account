package com.fitech.account.model;

import com.fitech.base.model.FTObject;

import java.util.List;

/**
 * Created by chun on 2017/2/16.
 */
public class FAReportTemplate extends FTObject{

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    private String templateName;

    private FARowTemplate rowTemplate;


    public FARowTemplate getRowTemplate() {
        return rowTemplate;
    }

    public void setRowTemplate(FARowTemplate rowTemplate) {
        this.rowTemplate = rowTemplate;
    }


}
