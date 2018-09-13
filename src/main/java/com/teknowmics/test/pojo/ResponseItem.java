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
public class ResponseItem {

    @JsonProperty("keyValue")
    private List<KeyValue> keyValue;
    private List<String> files;

    public List<KeyValue> getKeyValue() {
        if (keyValue == null) {
            keyValue = new ArrayList<>();
        }
        return keyValue;
    }

    public void setKeyValue(List<KeyValue> keyValue) {
        this.keyValue = keyValue;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

}
