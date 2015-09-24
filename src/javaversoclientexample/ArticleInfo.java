/**
 * Copyright 2009 Intelligent Sense.
 * 
 * All Rights Reserved.
 * This software is the proprietary information of
 * Intelligent Sense.
 * Use this subject to license terms.
 * 
 * Filename: ImportArticlesBatchInfo.java
 * ImportArticlesBatchInfo
 */
package javaversoclientexample;

/**
 * Class to handle the import article object
 */ 
public class ArticleInfo {
    
    
    // <editor-fold defaultstate="collapsed" desc="Properties">
    
    private String ArticleNo;
    private String SerialNo;
    private String Description;
    private String DeliveryAddress;
    private String WarratyStartDateValue;
    private String WarrantyEndDateValue;
    private String PriceValue;
    private String SupplierCode;
    private String OrderNumber;
    private String BuyChannel;
       
    // </editor-fold>
   
    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    
    /**
     * The Class constructor
     * @param pArticleNo: The article No to be imported
     * @param pSerialNo: The article Serial No to be imported
     * @param pDescription: The article Description
     * @param pDeliveryAddress: The article delivery address
     * @param pWarratyStartDateValue: The article warranty start date
     * @param pWarrantyEndDateValue: The article warranty end date
     * @param pPriceValue: The article price value
     * @param pSupplierCode: The article supplier code
     * @param pOrderNumber : The article order or contract number
     * @param pBuyChannel : The article buy channel
     */
    public ArticleInfo(String pArticleNo, String pSerialNo, String pDescription,
            String pDeliveryAddress, String pWarratyStartDateValue, String pWarrantyEndDateValue,
            String pPriceValue, String pSupplierCode, String pOrderNumber, String pBuyChannel) {
        this.ArticleNo = pArticleNo;
        this.SerialNo = pSerialNo;
        this.Description = pDescription;
        this.DeliveryAddress = pDeliveryAddress;
        this.WarratyStartDateValue = pWarratyStartDateValue;
        this.WarrantyEndDateValue = pWarrantyEndDateValue;
        this.PriceValue = pPriceValue;
        this.SupplierCode = pSupplierCode;
        this.OrderNumber = pOrderNumber;
        this.BuyChannel = pBuyChannel;
    }
    
    /**
     * ArticleNo getter
     * @return ArticleNo
     */
    public String getArticleNo() {
        return ArticleNo;
    }

    /**
     * SerialNo getter
     * @return SerialNo
     */
    public String getSerialNo() {
        return SerialNo;
    }

    /**
     * Description getter
     * @return Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * DeliveryAddress getter
     * @return DeliveryAddress
     */
    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    /**
     * WarrantyStartDateValue getter
     * @return WarrantyStartDateValue
     */
    public String getWarratyStartDateValue() {
        return WarratyStartDateValue;
    }

    /**
     * WarrantyEndDateValue getter
     * @return WarrantyEndDateValue
     */
    public String getWarrantyEndDateValue() {
        return WarrantyEndDateValue;
    }

    /**
     * PriceValue getter
     * @return PriceValue
     */
    public String getPriceValue() {
        return PriceValue;
    }

    /**
     * SupplierCode getter
     * @return SupplierCode
     */
    public String getSupplierCode() {
        return SupplierCode;
    }

    /**
     * OrderNumber getter
     * @return OrderNumber
     */
    public String getOrderNumber() {
        return OrderNumber;
    }
    
    /**
     * BuyChannel getter
     * @return BuyChannel
     */
    public String getBuyChannel() {
        return BuyChannel;
    }

    /**
     * pArticleNo setter
     * @param pArticleNo ArticleNo to be set
     */
    public void setArticleNo(String pArticleNo) {
        this.ArticleNo = pArticleNo;
    }

    /**
     * pSerialNo setter
     * @param pSerialNo SerialNo to be set
     */
    public void setSerialNo(String pSerialNo) {
        this.SerialNo = pSerialNo;
    }

    /**
     * Description setter
     * @param pDescription Description to be set
     */
    public void setDescription(String pDescription) {
        this.Description = pDescription;
    }

    /**
     * DeliveryAddress setter
     * @param pDeliveryAddress DeliveryAddress to be set
     */
    public void setDeliveryAddress(String pDeliveryAddress) {
        this.DeliveryAddress = pDeliveryAddress;
    }

    /**
     * WarratyStartDateValue setter
     * @param pWarratyStartDateValue WarratyStartDateValue to be set
     */
    public void setWarratyStartDateValue(String pWarratyStartDateValue) {
        this.WarratyStartDateValue = pWarratyStartDateValue;
    }

    /**
     * WarrantyEndDateValue setter
     * @param pWarrantyEndDateValue WarrantyEndDateValue to be set
     */
    public void setWarrantyEndDateValue(String pWarrantyEndDateValue) {
        this.WarrantyEndDateValue = pWarrantyEndDateValue;
    }

    /**
     * PriceValue setter
     * @param pPriceValue PriceValue to be set
     */
    public void setPriceValue(String pPriceValue) {
        this.PriceValue = pPriceValue;
    }

    /**
     * SupplierCode setter
     * @param pSupplierCode SupplierCode to be set
     */
    public void setSupplierCode(String pSupplierCode) {
        this.SupplierCode = pSupplierCode;
    }

    /**
     * OrderNumber setter
     * @param pOrderNumber OrderNumber to be set
     */
    public void setOrderNumber(String pOrderNumber) {
        this.OrderNumber = pOrderNumber;
    }
    
    /**
     * BuyChannel setter
     * @param pBuyChannel BuyChannel to be set
     */
    public void setBuyChannel(String pBuyChannel) {
        this.BuyChannel = pBuyChannel;
    }
    
    // </editor-fold>
    
    
}
