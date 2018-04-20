import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 来自于mkyong的例子,把HashMap改成了TreeMap
 */
public class JsonToTreeMap
{
        public static void main(String[] args) {

            try {

                ObjectMapper mapper = new ObjectMapper();
                String json = "{\"name\":\"mkyong\", \"age\":29}";

                Map<String, Object> map = new TreeMap<String, Object>();

                // convert JSON string to Map
                map = mapper.readValue(json, new TypeReference<TreeMap<String, String>>(){});

                System.out.println(map);

            } catch (JsonGenerationException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
