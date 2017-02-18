package com.fitech.account.item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chun on 2017/2/18.
 */
public class ItemRegistry {

    private static ItemRegistry registry = null;

    private List<DataItem> items;


    private ItemRegistry(){
        this.items = new ArrayList<DataItem>();
    }

    public static ItemRegistry getInstance(){
        if (null == registry) {
            registry = new ItemRegistry();
        }
        return registry;
    }

    protected void register(DataItem item){
        this.items.add(item);
    }

}
