
package pojo.groupCate;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GroupCate {

    private String appId;
    private List<Cate> cates = null;
    private Boolean isUpdate;
    private String storeId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GroupCate() {
    }

    /**
     * 
     * @param cates
     * @param appId
     * @param storeId
     * @param isUpdate
     */
    public GroupCate(String appId, List<Cate> cates, Boolean isUpdate, String storeId) {
        super();
        this.appId = appId;
        this.cates = cates;
        this.isUpdate = isUpdate;
        this.storeId = storeId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public List<Cate> getCates() {
        return cates;
    }

    public void setCates(List<Cate> cates) {
        this.cates = cates;
    }

    public Boolean getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

}
