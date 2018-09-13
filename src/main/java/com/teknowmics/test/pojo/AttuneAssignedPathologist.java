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
public class AttuneAssignedPathologist {

    @JsonProperty("AssignedPathologist")
    public String AssignedPathologist;

    @JsonProperty("AssignedDatetime")
    public String AssignedDatetime;

    @JsonProperty("AccessionNumber")
    public String AccessionNumber;

    public String getAssignedPathologist() {
        return AssignedPathologist;
    }

    public String getAssignedDatetime() {
        return AssignedDatetime;
    }

    public String getAccessionNumber() {
        return AccessionNumber;
    }

    public void setAssignedPathologist(String AssignedPathologist) {
        this.AssignedPathologist = AssignedPathologist;
    }

    public void setAssignedDatetime(String AssignedDatetime) {
        this.AssignedDatetime = AssignedDatetime;
    }

    public void setAccessionNumber(String AccessionNumber) {
        this.AccessionNumber = AccessionNumber;
    }

}
