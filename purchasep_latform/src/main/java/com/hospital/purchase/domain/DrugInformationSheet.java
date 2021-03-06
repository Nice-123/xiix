package com.hospital.purchase.domain;

import java.util.Date;

public class DrugInformationSheet {
    private Integer drugId;

    private Integer drugSerialNumber;

    private Integer drugItemNo;

    private String genericDrug;

    private String dosageForm;

    private String specification;

    private String units;

    private Integer conversionFactor;

    private Integer enterpriseId;

    private String tradeName;

    private Float thePrice;

    private Integer approvalNumber;

    private Date approvalNumberDate;

    private Integer whetherImport;

    private String packaging;

    private String packingUnit;

    private Float latestRetailPrice;

    private String sourcePrice;

    private Integer levelId;

    private String qualityHierarchy;

    private Integer inspectionReport;

    private Integer drugInspection;

    private Date drugInspectionReport;

    private Integer dcId;

    private Integer descripId;

    private String description;

    private Integer isdel;

    private Integer proxyId;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getDrugSerialNumber() {
        return drugSerialNumber;
    }

    public void setDrugSerialNumber(Integer drugSerialNumber) {
        this.drugSerialNumber = drugSerialNumber;
    }

    public Integer getDrugItemNo() {
        return drugItemNo;
    }

    public void setDrugItemNo(Integer drugItemNo) {
        this.drugItemNo = drugItemNo;
    }

    public String getGenericDrug() {
        return genericDrug;
    }

    public void setGenericDrug(String genericDrug) {
        this.genericDrug = genericDrug == null ? null : genericDrug.trim();
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm == null ? null : dosageForm.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units == null ? null : units.trim();
    }

    public Integer getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(Integer conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName == null ? null : tradeName.trim();
    }

    public Float getThePrice() {
        return thePrice;
    }

    public void setThePrice(Float thePrice) {
        this.thePrice = thePrice;
    }

    public Integer getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(Integer approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public Date getApprovalNumberDate() {
        return approvalNumberDate;
    }

    public void setApprovalNumberDate(Date approvalNumberDate) {
        this.approvalNumberDate = approvalNumberDate;
    }

    public Integer getWhetherImport() {
        return whetherImport;
    }

    public void setWhetherImport(Integer whetherImport) {
        this.whetherImport = whetherImport;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging == null ? null : packaging.trim();
    }

    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit == null ? null : packingUnit.trim();
    }

    public Float getLatestRetailPrice() {
        return latestRetailPrice;
    }

    public void setLatestRetailPrice(Float latestRetailPrice) {
        this.latestRetailPrice = latestRetailPrice;
    }

    public String getSourcePrice() {
        return sourcePrice;
    }

    public void setSourcePrice(String sourcePrice) {
        this.sourcePrice = sourcePrice == null ? null : sourcePrice.trim();
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getQualityHierarchy() {
        return qualityHierarchy;
    }

    public void setQualityHierarchy(String qualityHierarchy) {
        this.qualityHierarchy = qualityHierarchy == null ? null : qualityHierarchy.trim();
    }

    public Integer getInspectionReport() {
        return inspectionReport;
    }

    public void setInspectionReport(Integer inspectionReport) {
        this.inspectionReport = inspectionReport;
    }

    public Integer getDrugInspection() {
        return drugInspection;
    }

    public void setDrugInspection(Integer drugInspection) {
        this.drugInspection = drugInspection;
    }

    public Date getDrugInspectionReport() {
        return drugInspectionReport;
    }

    public void setDrugInspectionReport(Date drugInspectionReport) {
        this.drugInspectionReport = drugInspectionReport;
    }

    public Integer getDcId() {
        return dcId;
    }

    public void setDcId(Integer dcId) {
        this.dcId = dcId;
    }

    public Integer getDescripId() {
        return descripId;
    }

    public void setDescripId(Integer descripId) {
        this.descripId = descripId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Integer getProxyId() {
        return proxyId;
    }

    public void setProxyId(Integer proxyId) {
        this.proxyId = proxyId;
    }
}