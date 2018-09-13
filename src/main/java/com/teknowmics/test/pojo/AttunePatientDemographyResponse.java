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
public class AttunePatientDemographyResponse {

    @JsonProperty("PatientDemography")
    public AttunePatientDemography patientDemography;

    @JsonProperty("lstTRFiles")
    public List<AttuneTRFFile> lstTRFiles;

    @JsonProperty("lstAssignedPathologist")
    public List<AttuneAssignedPathologist> lstAssignedPathologist;

    public AttunePatientDemography getPatientDemography() {
        return patientDemography;
    }

    public List<AttuneTRFFile> getLstTRFiles() {
        return lstTRFiles;
    }

    public List<AttuneAssignedPathologist> getLstAssignedPathologist() {
        return lstAssignedPathologist;
    }

    public void setPatientDemography(AttunePatientDemography patientDemography) {
        this.patientDemography = patientDemography;
    }

    public void setLstTRFiles(List<AttuneTRFFile> lstTRFiles) {
        this.lstTRFiles = lstTRFiles;
    }

    public void setLstAssignedPathologist(List<AttuneAssignedPathologist> lstAssignedPathologist) {
        this.lstAssignedPathologist = lstAssignedPathologist;
    }

}
