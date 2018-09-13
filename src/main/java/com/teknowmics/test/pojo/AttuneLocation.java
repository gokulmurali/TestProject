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
public class AttuneLocation {
 
    @JsonProperty("LocationID")
    public String LocationID;
    
    @JsonProperty("LocationName")
    public String LocationName;
    
    @JsonProperty("AttLocationId")
    public String AttLocationId;

    public String getLocationID() {
        return LocationID;
    }

    public String getLocationName() {
        return LocationName;
    }

    public String getAttLocationId() {
        return AttLocationId;
    }

    public void setLocationID(String LocationID) {
        this.LocationID = LocationID;
    }

    public void setLocationName(String LocationName) {
        this.LocationName = LocationName;
    }

    public void setAttLocationId(String AttLocationId) {
        this.AttLocationId = AttLocationId;
    }
    
    
}
