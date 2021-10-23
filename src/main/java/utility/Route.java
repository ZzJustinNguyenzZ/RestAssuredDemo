package utility;

public class Route {
    private static final String ImportItems = "/v2/item-mgmt/bigc/import-item";
    private static final String ImportGroupVariant = "/v2/item-mgmt/bigc/group-variant/import";

    public static final String GetListItems(String appID, String storeID) {
        return "/v1/oa-shop/" + appID + "/food-items?promotion_status=3&page_index=1&page_size=50&store_id=" + storeID + "";
    }

    public static String ImportItems() {
        return ImportItems;
    }

    public static String ImportGroupVariant(){
        return ImportGroupVariant;
    }
}
