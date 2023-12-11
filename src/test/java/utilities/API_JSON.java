package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class API_JSON {
    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    //Convert Java object to JSON format (Serialization)
    public static String convertJavaToJson(Object object){
        String jsonResult = "";
        try {
            jsonResult =mapper.writeValueAsString(object);
        } catch (IOException e) {
            System.out.println("Exception occurred while converting Java to Json" + e.getMessage());
        }
        return jsonResult;
    }

    //Convert Java format to Java Object(De-serialization)
    public static <T>T convertJsonToJava(String json, Class<T> clss){
        T javaResult = null;
        try {
            javaResult = mapper.readValue(json, clss);
        } catch (IOException e) {
            System.out.println("Exception occurred while converting Json to Java" + e.getMessage());
        }
        return javaResult;
    }

}
