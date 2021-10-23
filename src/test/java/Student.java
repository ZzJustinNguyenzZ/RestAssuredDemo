import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.groupCate.Cate;
import pojo.groupCate.GroupCate;
import pojo.groupVariant.Datum;
import pojo.groupVariant.GroupVariant;
import org.junit.Test;

import java.util.ArrayList;

public class Student {
    String appID = "742";
    String storeID = "1444_4878";
    ObjectMapper objectMapper = new ObjectMapper();
    Datum datum = new Datum();
    Datum datum1 = new Datum();
    GroupVariant groupVariant = new GroupVariant();
    Cate cate = new Cate();
    GroupCate groupCate = new GroupCate();


    @Test
    public void test1() throws JsonProcessingException {

        datum.setAppId(appID);
        datum1.setAppId("123");
        ArrayList list = new ArrayList();
        list.add(datum);
        list.add(datum1);

        groupVariant.setData(list);

        String payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(groupVariant);
        System.out.println(payload);

        cate.setCategoryLabel("1");
        ArrayList list1 = new ArrayList();
        list1.add(cate);
        groupCate.setCates(list1);

        String payload1 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(groupCate);
        System.out.println(payload1);
    }
}