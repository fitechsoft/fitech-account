package com.fitech.account.model;

import com.fitech.account.item.DataItem;
import com.fitech.base.model.FTNamedObject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by chun on 2017/2/16.
 */
@Entity
public class LineTemplate extends FTNamedObject {

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DataItem> items;

    public List<DataItem> getItems() {

        if (null == this.items)
            this.items = new ArrayList<DataItem>();

        return items;
    }

    public void setItems(List<DataItem> items) {
        this.items = items;
    }

    public void addItem(DataItem item) {

        this.getItems().add(item);
    }

    public ReportLine generateLineInstance() throws LineGenerationException {

        //TODO

        ReportLine newRow = new ReportLine(); //TODO: Should use factory pattern

        try {
            for (DataItem field : items) {

                newRow.addItem(field.clone());
            }
        } catch (CloneNotSupportedException e) {
            throw new LineGenerationException();
        }

        return newRow;

    }

}
