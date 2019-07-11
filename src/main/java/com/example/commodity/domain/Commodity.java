package com.example.commodity.domain;

public class Commodity {
    private Integer commodityId;
    private String commodityName;
    private Double commodityPrice;

    public Commodity(String commodityName, Double commodityPrice, String commodityDescription) {
        this.commodityName = commodityName;
        this.commodityPrice = commodityPrice;
        this.commodityDescription = commodityDescription;
    }

    private String commodityDescription;

    public Commodity() {
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityId=" + commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", commodityPrice=" + commodityPrice +
                ", commodityDescription='" + commodityDescription + '\'' +
                '}';
    }

    public Commodity(Integer commodityId, String commodityName, Double commodityPrice, String commodityDescription) {
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.commodityPrice = commodityPrice;
        this.commodityDescription = commodityDescription;
    }

    public Commodity(String commodityName, String commodityDescription) {
        this.commodityName = commodityName;
        this.commodityDescription = commodityDescription;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityDescription() {
        return commodityDescription;
    }

    public void setCommodityDescription(String commodityDescription) {
        this.commodityDescription = commodityDescription;
    }
}
