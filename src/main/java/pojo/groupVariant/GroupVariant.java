
package pojo.groupVariant;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class GroupVariant {

    private List<Datum> data = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GroupVariant() {
    }

    /**
     * 
     * @param data
     */
    public GroupVariant(List<Datum> data) {
        super();
        this.data = data;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
