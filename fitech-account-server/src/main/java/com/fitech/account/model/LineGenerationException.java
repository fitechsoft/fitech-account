package com.fitech.account.model;

/**
 * Created by chun on 2017/2/17.
 */
public class LineGenerationException extends  Exception {

    public LineGenerationException(){
        super("An error occurred while generating a new row!");
    }

}
