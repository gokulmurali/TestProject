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
public class AttunePatientDemography {

    @JsonProperty("PatientName")
    public String PatientName;

    @JsonProperty("VisitNumber")
    public String VisitNumber;

    @JsonProperty("MLNumber")
    public String MLNumber;

    @JsonProperty("VisitDate")
    public String VisitDate;

    @JsonProperty("CollectedDateTime")
    public String CollectedDateTime;

    @JsonProperty("Doctor")
    public String Doctor;

    @JsonProperty("AgeSex")
    public String AgeSex;

    @JsonProperty("InvestigationName")
    public String InvestigationName;

    @JsonProperty("History")
    public String History;

    @JsonProperty("Tat")
    public String Tat;

    @JsonProperty("TRF")
    public String TRF;

    @JsonProperty("Location")
    public String Location;

    @JsonProperty("OrgName")
    public String OrgName;

    @JsonProperty("ClientName")
    public String ClientName;

    @JsonProperty("ClientCode")
    public String ClientCode;

    @JsonProperty("ClientAddress")
    public String ClientAddress;

    @JsonProperty("ExternalPatientNumber")
    public String ExternalPatientNumber;

    @JsonProperty("PatientVisitId")
    public Long PatientVisitId;

    @JsonProperty("OrgID")
    public Long OrgID;

    @JsonProperty("SampleName")
    public String SampleName;

    @JsonProperty("PatientID")
    public Long PatientID;

    @JsonProperty("DOB")
    public String DOB;

    @JsonProperty("AccessionNumber")
    public Long AccessionNumber;

    @JsonProperty("ReferingPhysicianName")
    public String ReferingPhysicianName;

    public String getPatientName() {
        return PatientName;
    }

    public String getVisitNumber() {
        return VisitNumber;
    }

    public String getMLNumber() {
        return MLNumber;
    }

    public String getVisitDate() {
        return VisitDate;
    }

    public String getCollectedDateTime() {
        return CollectedDateTime;
    }

    public String getDoctor() {
        return Doctor;
    }

    public String getAgeSex() {
        return AgeSex;
    }

    public String getInvestigationName() {
        return InvestigationName;
    }

    public String getHistory() {
        return History;
    }

    public String getTat() {
        return Tat;
    }

    public String getTRF() {
        return TRF;
    }

    public String getLocation() {
        return Location;
    }

    public String getOrgName() {
        return OrgName;
    }

    public String getClientName() {
        return ClientName;
    }

    public String getClientCode() {
        return ClientCode;
    }

    public String getClientAddress() {
        return ClientAddress;
    }

    public String getExternalPatientNumber() {
        return ExternalPatientNumber;
    }

    public Long getPatientVisitId() {
        return PatientVisitId;
    }

    public Long getOrgID() {
        return OrgID;
    }

    public String getSampleName() {
        return SampleName;
    }

    public Long getPatientID() {
        return PatientID;
    }

    public String getDOB() {
        return DOB;
    }

    public Long getAccessionNumber() {
        return AccessionNumber;
    }

    public void setPatientVisitId(Long PatientVisitId) {
        this.PatientVisitId = PatientVisitId;
    }

    public void setOrgID(Long OrgID) {
        this.OrgID = OrgID;
    }

    public void setPatientID(Long PatientID) {
        this.PatientID = PatientID;
    }

    public void setAccessionNumber(Long AccessionNumber) {
        this.AccessionNumber = AccessionNumber;
    }

    public String getReferingPhysicianName() {
        return ReferingPhysicianName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public void setVisitNumber(String VisitNumber) {
        this.VisitNumber = VisitNumber;
    }

    public void setMLNumber(String MLNumber) {
        this.MLNumber = MLNumber;
    }

    public void setVisitDate(String VisitDate) {
        this.VisitDate = VisitDate;
    }

    public void setCollectedDateTime(String CollectedDateTime) {
        this.CollectedDateTime = CollectedDateTime;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public void setAgeSex(String AgeSex) {
        this.AgeSex = AgeSex;
    }

    public void setInvestigationName(String InvestigationName) {
        this.InvestigationName = InvestigationName;
    }

    public void setHistory(String History) {
        this.History = History;
    }

    public void setTat(String Tat) {
        this.Tat = Tat;
    }

    public void setTRF(String TRF) {
        this.TRF = TRF;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public void setClientCode(String ClientCode) {
        this.ClientCode = ClientCode;
    }

    public void setClientAddress(String ClientAddress) {
        this.ClientAddress = ClientAddress;
    }

    public void setExternalPatientNumber(String ExternalPatientNumber) {
        this.ExternalPatientNumber = ExternalPatientNumber;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


}
