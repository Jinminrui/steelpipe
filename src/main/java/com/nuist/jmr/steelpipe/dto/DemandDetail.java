package com.nuist.jmr.steelpipe.dto;

import com.nuist.jmr.steelpipe.entity.DemandInfo;

public class DemandDetail {
    private DemandInfo demandInfo;
    private String productType;
    private String demandFromName;
    private String demandFromPhone;

    public DemandInfo getDemandInfo() {
        return demandInfo;
    }

    public void setDemandInfo(DemandInfo demandInfo) {
        this.demandInfo = demandInfo;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getDemandFromName() {
        return demandFromName;
    }

    public void setDemandFromName(String demandFromName) {
        this.demandFromName = demandFromName;
    }

    public String getDemandFromPhone() {
        return demandFromPhone;
    }

    public void setDemandFromPhone(String demandFromPhone) {
        this.demandFromPhone = demandFromPhone;
    }
}
