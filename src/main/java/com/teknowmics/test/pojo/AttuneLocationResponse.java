/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


/**
 *
 * @author gokul
 */
public class AttuneLocationResponse {

    @JsonProperty("status")
    public String status;

    @JsonProperty("response")
    public List<AttuneLocation> response;

    public String getStatus() {
        return status;
    }

    public List<AttuneLocation> getResponse() {
        return response;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResponse(List<AttuneLocation> response) {
        this.response = response;
    }

}
