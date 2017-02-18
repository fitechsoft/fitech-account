package com.fitech.account.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chun on 2017/2/18.
 */
public class LineReport extends Report {

    private List<ReportLine> lines;

    public List<ReportLine> getLines() {
        if (null == this.lines)
            this.lines = new ArrayList<ReportLine>();
        return lines;
    }

}
