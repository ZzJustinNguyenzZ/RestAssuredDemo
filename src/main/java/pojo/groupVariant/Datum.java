
package pojo.groupVariant;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Datum {

    private String appId;
    private String storeId;
    private String productSku;
    private String groupCode;
    private String groupAliasName;
    private String groupDisplayName;
    private Integer groupOrdering;
    private Integer isRequired;
    private Integer isMultiChoice;
    private Integer maxSelect;
    private String groupStatus;
    private String variantAliasName;
    private String variantDisplayName;
    private Integer variantOrdering;
    private String variantCode;
    private String variantPrice;
    private String variantStatus;
    private String variantImg;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param isRequired
     * @param maxSelect
     * @param groupStatus
     * @param storeId
     * @param isMultiChoice
     * @param groupDisplayName
     * @param variantDisplayName
     * @param productSku
     * @param groupAliasName
     * @param variantCode
     * @param appId
     * @param variantStatus
     * @param variantImg
     * @param groupOrdering
     * @param variantPrice
     * @param variantOrdering
     * @param groupCode
     * @param variantAliasName
     */
    public Datum(String appId, String storeId, String productSku, String groupCode, String groupAliasName, String groupDisplayName, Integer groupOrdering, Integer isRequired, Integer isMultiChoice, Integer maxSelect, String groupStatus, String variantAliasName, String variantDisplayName, Integer variantOrdering, String variantCode, String variantPrice, String variantStatus, String variantImg) {
        super();
        this.appId = appId;
        this.storeId = storeId;
        this.productSku = productSku;
        this.groupCode = groupCode;
        this.groupAliasName = groupAliasName;
        this.groupDisplayName = groupDisplayName;
        this.groupOrdering = groupOrdering;
        this.isRequired = isRequired;
        this.isMultiChoice = isMultiChoice;
        this.maxSelect = maxSelect;
        this.groupStatus = groupStatus;
        this.variantAliasName = variantAliasName;
        this.variantDisplayName = variantDisplayName;
        this.variantOrdering = variantOrdering;
        this.variantCode = variantCode;
        this.variantPrice = variantPrice;
        this.variantStatus = variantStatus;
        this.variantImg = variantImg;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupAliasName() {
        return groupAliasName;
    }

    public void setGroupAliasName(String groupAliasName) {
        this.groupAliasName = groupAliasName;
    }

    public String getGroupDisplayName() {
        return groupDisplayName;
    }

    public void setGroupDisplayName(String groupDisplayName) {
        this.groupDisplayName = groupDisplayName;
    }

    public Integer getGroupOrdering() {
        return groupOrdering;
    }

    public void setGroupOrdering(Integer groupOrdering) {
        this.groupOrdering = groupOrdering;
    }

    public Integer getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }

    public Integer getIsMultiChoice() {
        return isMultiChoice;
    }

    public void setIsMultiChoice(Integer isMultiChoice) {
        this.isMultiChoice = isMultiChoice;
    }

    public Integer getMaxSelect() {
        return maxSelect;
    }

    public void setMaxSelect(Integer maxSelect) {
        this.maxSelect = maxSelect;
    }

    public String getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }

    public String getVariantAliasName() {
        return variantAliasName;
    }

    public void setVariantAliasName(String variantAliasName) {
        this.variantAliasName = variantAliasName;
    }

    public String getVariantDisplayName() {
        return variantDisplayName;
    }

    public void setVariantDisplayName(String variantDisplayName) {
        this.variantDisplayName = variantDisplayName;
    }

    public Integer getVariantOrdering() {
        return variantOrdering;
    }

    public void setVariantOrdering(Integer variantOrdering) {
        this.variantOrdering = variantOrdering;
    }

    public String getVariantCode() {
        return variantCode;
    }

    public void setVariantCode(String variantCode) {
        this.variantCode = variantCode;
    }

    public String getVariantPrice() {
        return variantPrice;
    }

    public void setVariantPrice(String variantPrice) {
        this.variantPrice = variantPrice;
    }

    public String getVariantStatus() {
        return variantStatus;
    }

    public void setVariantStatus(String variantStatus) {
        this.variantStatus = variantStatus;
    }

    public String getVariantImg() {
        return variantImg;
    }

    public void setVariantImg(String variantImg) {
        this.variantImg = variantImg;
    }

}
