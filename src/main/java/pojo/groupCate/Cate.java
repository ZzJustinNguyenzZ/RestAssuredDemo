
package pojo.groupCate;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Cate {

    private String id;
    private String name;
    private Integer sort;
    private String image;
    private String refId;
    private String createdBy;
    private String createdTime;
    private String modifiedBy;
    private String modifiedTime;
    private String status;
    private Boolean isDeleted;
    private String appId;
    private String categoryLabel;
    private String storeId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cate() {
    }

    /**
     * 
     * @param image
     * @param modifiedTime
     * @param categoryLabel
     * @param sort
     * @param storeId
     * @param isDeleted
     * @param createdBy
     * @param appId
     * @param name
     * @param createdTime
     * @param modifiedBy
     * @param id
     * @param refId
     * @param status
     */
    public Cate(String id, String name, Integer sort, String image, String refId, String createdBy, String createdTime, String modifiedBy, String modifiedTime, String status, Boolean isDeleted, String appId, String categoryLabel, String storeId) {
        super();
        this.id = id;
        this.name = name;
        this.sort = sort;
        this.image = image;
        this.refId = refId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.modifiedBy = modifiedBy;
        this.modifiedTime = modifiedTime;
        this.status = status;
        this.isDeleted = isDeleted;
        this.appId = appId;
        this.categoryLabel = categoryLabel;
        this.storeId = storeId;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public String getCategoryLabel() {
        return categoryLabel;
    }

    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

}
