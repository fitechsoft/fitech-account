package com.fitech.account.model;

import com.fitech.account.item.DataItem;
import com.fitech.base.model.FTNamedObject;
import com.fitech.base.model.FTSubject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chun on 2017/2/16.
 */
public class ReportLine extends FTNamedObject {

    public FTSubject getOwner() {
        return owner;
    }

    public void setOwner(FTSubject owner) {
        this.owner = owner;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    //TODO: be a subject of a specific type
    private FTSubject owner;

    //TODO: should have more information along with one line
    private String memo;

    private List<DataItem> items;

    public List<DataItem> getItems() {
        return items;
    }

    public void setItems(List<DataItem> items) {
        this.items = items;
    }

    public void addItem(DataItem field){
        if (null == this.items)
            this.items = new ArrayList<DataItem>();

        this.items.add(field);
    }

}
