/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author gokul
 */
public class Items {

    @JsonProperty("item")
    private List<Item> item;

    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<>();
        }
        return this.item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
