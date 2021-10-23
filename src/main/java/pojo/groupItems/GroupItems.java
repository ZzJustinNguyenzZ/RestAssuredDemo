
package pojo.groupItems;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class GroupItems {

    private String appId;
    private List<Item> items = null;
    private Boolean isUpdate;
    private String storeId;

    /**
     * No args constructor for use in serialization
     */
    public GroupItems() {
    }

    /**
     * @param appId
     * @param storeId
     * @param items
     * @param isUpdate
     */
    public GroupItems(String appId, List<Item> items, Boolean isUpdate, String storeId) {
        super();
        this.appId = appId;
        this.items = items;
        this.isUpdate = isUpdate;
        this.storeId = storeId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
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
