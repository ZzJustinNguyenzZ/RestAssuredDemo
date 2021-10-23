
package pojo.groupItems;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Item {

    private String id;
    private String name;
    private String barcode;
    private Integer sort;
    private List<String> categoryRefIds = null;
    private List<String> categoryIds = null;
    private String image;
    private Integer basePrice;
    private Integer price;
    private String description;
    private Integer stock;
    private String createdBy;
    private String createdTime;
    private String modifiedBy;
    private String modifiedTime;
    private int status;
    private Boolean isDeleted;
    private String appId;
    private Integer sequenceId;
    private String storeId;
    private String sectionId;
    private String note;
    private String goldCode;
    private Integer limitQuantity;
    private int itemType;
    private Integer sv;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param modifiedTime
     * @param note
     * @param itemType
     * @param description
     * @param sequenceId
     * @param limitQuantity
     * @param isDeleted
     * @param price
     * @param appId
     * @param createdTime
     * @param modifiedBy
     * @param id
     * @param stock
     * @param barcode
     * @param basePrice
     * @param image
     * @param categoryRefIds
     * @param sv
     * @param sort
     * @param sectionId
     * @param storeId
     * @param categoryIds
     * @param goldCode
     * @param createdBy
     * @param name
     * @param status
     */
    public Item(String id, String name, String barcode, Integer sort, List<String> categoryRefIds, List<String> categoryIds, String image, Integer basePrice, Integer price, String description, Integer stock, String createdBy, String createdTime, String modifiedBy, String modifiedTime, int status, Boolean isDeleted, String appId, Integer sequenceId, String storeId, String sectionId, String note, String goldCode, Integer limitQuantity, int itemType, Integer sv) {
        super();
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.sort = sort;
        this.categoryRefIds = categoryRefIds;
        this.categoryIds = categoryIds;
        this.image = image;
        this.basePrice = basePrice;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.modifiedBy = modifiedBy;
        this.modifiedTime = modifiedTime;
        this.status = status;
        this.isDeleted = isDeleted;
        this.appId = appId;
        this.sequenceId = sequenceId;
        this.storeId = storeId;
        this.sectionId = sectionId;
        this.note = note;
        this.goldCode = goldCode;
        this.limitQuantity = limitQuantity;
        this.itemType = itemType;
        this.sv = sv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public List<String> getCategoryRefIds() {
        return categoryRefIds;
    }

    public void setCategoryRefIds(List<String> categoryRefIds) {
        this.categoryRefIds = categoryRefIds;
    }

    public List<String> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getGoldCode() {
        return goldCode;
    }

    public void setGoldCode(String goldCode) {
        this.goldCode = goldCode;
    }

    public Integer getLimitQuantity() {
        return limitQuantity;
    }

    public void setLimitQuantity(Integer limitQuantity) {
        this.limitQuantity = limitQuantity;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public Integer getSv() {
        return sv;
    }

    public void setSv(Integer sv) {
        this.sv = sv;
    }

}
