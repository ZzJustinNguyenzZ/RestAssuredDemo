package pojo;

import java.util.List;
public class Items
{
    private String id;

    private String name;

    private String barcode;

    private int sort;

    private List<String> category_ref_ids;

    private List<String> category_ids;

    private String image;

    private String base_price;

    private String price;

    private String description;

    private int stock;

    private String created_by;

    private String created_time;

    private String modified_by;

    private String modified_time;

    private int status;

    private boolean is_deleted;

    private String app_id;

    private int sequence_id;

    private String store_id;

    private String section_id;

    private String note;

    private String gold_code;

    private int limit_quantity;

    private int item_type;

    private int sv;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBarcode(String barcode){
        this.barcode = barcode;
    }
    public String getBarcode(){
        return this.barcode;
    }
    public void setSort(int sort){
        this.sort = sort;
    }
    public int getSort(){
        return this.sort;
    }
    public void setCategory_ref_ids(List<String> category_ref_ids){
        this.category_ref_ids = category_ref_ids;
    }
    public List<String> getCategory_ref_ids(){
        return this.category_ref_ids;
    }
    public void setCategory_ids(List<String> category_ids){
        this.category_ids = category_ids;
    }
    public List<String> getCategory_ids(){
        return this.category_ids;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getImage(){
        return this.image;
    }
    public void setBase_price(String base_price){
        this.base_price = base_price;
    }
    public String getBase_price(){
        return this.base_price;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public String getPrice(){
        return this.price;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public int getStock(){
        return this.stock;
    }
    public void setCreated_by(String created_by){
        this.created_by = created_by;
    }
    public String getCreated_by(){
        return this.created_by;
    }
    public void setCreated_time(String created_time){
        this.created_time = created_time;
    }
    public String getCreated_time(){
        return this.created_time;
    }
    public void setModified_by(String modified_by){
        this.modified_by = modified_by;
    }
    public String getModified_by(){
        return this.modified_by;
    }
    public void setModified_time(String modified_time){
        this.modified_time = modified_time;
    }
    public String getModified_time(){
        return this.modified_time;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return this.status;
    }
    public void setIs_deleted(boolean is_deleted){
        this.is_deleted = is_deleted;
    }
    public boolean getIs_deleted(){
        return this.is_deleted;
    }
    public void setIs_update(boolean is_deleted){
        this.is_deleted = is_deleted;
    }
    public boolean getIs_update(){
        return this.is_deleted;
    }
    public void setApp_id(String app_id){
        this.app_id = app_id;
    }
    public String getApp_id(){
        return this.app_id;
    }
    public void setSequence_id(int sequence_id){
        this.sequence_id = sequence_id;
    }
    public int getSequence_id(){
        return this.sequence_id;
    }
    public void setStore_id(String store_id){
        this.store_id = store_id;
    }
    public String getStore_id(){
        return this.store_id;
    }
    public void setSection_id(String section_id){
        this.section_id = section_id;
    }
    public String getSection_id(){
        return this.section_id;
    }
    public void setNote(String note){
        this.note = note;
    }
    public String getNote(){
        return this.note;
    }
    public void setGold_code(String gold_code){
        this.gold_code = gold_code;
    }
    public String getGold_code(){
        return this.gold_code;
    }
    public void setLimit_quantity(int limit_quantity){
        this.limit_quantity = limit_quantity;
    }
    public int getLimit_quantity(){
        return this.limit_quantity;
    }
    public void setItem_type(int item_type){
        this.item_type = item_type;
    }
    public int getItem_type(){
        return this.item_type;
    }
    public void setSv(int sv){
        this.sv = sv;
    }
    public int getSv(){
        return this.sv;
    }
}


 class Root
{
    private String app_id;

    private List<Items> items;

    private boolean is_update;

    private String store_id;

    public void setApp_id(String app_id){
        this.app_id = app_id;
    }
    public String getApp_id(){
        return this.app_id;
    }
    public void setItems(List<Items> items){
        this.items = items;
    }
    public List<Items> getItems(){
        return this.items;
    }
    public void setIs_update(boolean is_update){
        this.is_update = is_update;
    }
    public boolean getIs_update(){
        return this.is_update;
    }
    public void setStore_id(String store_id){
        this.store_id = store_id;
    }
    public String getStore_id(){
        return this.store_id;
    }
}
