/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.pojo;

import java.util.ArrayList;

/**
 *
 * @author gokul
 */
public class Item {

    private ResponseItem ResponseItem;

    public ResponseItem getResponseItem() {
        if (ResponseItem == null) {
            ResponseItem = new ResponseItem();
        }
        return ResponseItem;
    }

    public void setResponseItem(ResponseItem ResponseItem) {
        this.ResponseItem = ResponseItem;
    }

}
