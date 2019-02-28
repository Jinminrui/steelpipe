package com.nuist.jmr.steelpipe.dto;

import com.nuist.jmr.steelpipe.entity.SupplyInfo;

public class SupplyDetail {
    private SupplyInfo supplyInfo;
    private String productType;
    private String supplyFromName;
    private String supplyFromPhone;

    public SupplyInfo getSupplyInfo() {
        return supplyInfo;
    }

    public void setSupplyInfo(SupplyInfo supplyInfo) {
        this.supplyInfo = supplyInfo;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSupplyFromName() {
        return supplyFromName;
    }

    public void setSupplyFromName(String supplyFromName) {
        this.supplyFromName = supplyFromName;
    }

    public String getSupplyFromPhone() {
        return supplyFromPhone;
    }

    public void setSupplyFromPhone(String supplyFromPhone) {
        this.supplyFromPhone = supplyFromPhone;
    }
}
