/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 *
 * @author gokul
 */
public class AttuneTRFFile {

    @JsonProperty("TRFBuffer")
    public String TRFBuffer;

    public String getTRFBuffer() {
        return TRFBuffer;
    }

    public void setTRFBuffer(String TRFBuffer) {
        this.TRFBuffer = TRFBuffer;
    }

}
