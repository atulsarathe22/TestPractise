import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class jsonTest {

    @Test
    public static void jsonCheck(){
        JSONObject js= new JSONObject();
        js.put("firstName","Atul");
        js.put("lastName","Sarathe");
        js.put("age",25);

        Map m= new LinkedHashMap();
        m.put("Street Address","F-202");
        m.put("city","Pune");
        m.put("postalCode",411027);

        js.put("Address",m);

        JSONArray ja=new JSONArray();
        Map n=new LinkedHashMap();
        n.put("type","home");
        n.put("number","1234");

        ja.add(n);

        n.put("type","fax");
        n.put("number","1234567");

        ja.add(n);

        js.put("phoneNumber",ja);

        System.out.println(js);
    }



    @Test
    public static void jsonCheck1(){
        JSONObject employeeDetails= new JSONObject();
        employeeDetails.put("name","abc");
        employeeDetails.put("age",25);
        employeeDetails.put("phone","12345");
        employeeDetails.put("Sex","Male");

        JSONObject employeeDetails1= new JSONObject();
        employeeDetails1.put("name","abcd");
        employeeDetails1.put("age",25);
        employeeDetails1.put("phone","123456");
        employeeDetails1.put("Sex","Male");

        JSONArray ja=new JSONArray();
        ja.add(employeeDetails);
        ja.add(employeeDetails1);

        JSONObject js=new JSONObject();
        js.put("EmployeeDetails",ja);
        System.out.println(js);

    }


    @Test
    public static void jsonReadTest(){
        Object obj=new Object();
        JSONParser jsonParser=new JSONParser();
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Atul Sarathe\\IdeaProjects\\TestProject\\src\\test\\Resources\\jsonFileStore\\jsonExample");
            obj=jsonParser.parse(fileReader);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ParseException e){
            e.printStackTrace();
        }

        JSONObject js=(JSONObject)obj;

        String firstName=js.get("firstName").toString();
        String lastName=js.get("lastName").toString();
        System.out.println(firstName);
        System.out.println(lastName);

        Map address=(Map)js.get("Address");

        Iterator<Map.Entry> itr=address.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry pair=itr.next();
            System.out.println(pair.getKey()+":"+pair.getValue());
        }

        JSONArray ja= (JSONArray)js.get("phoneNumber");
        Iterator itr2 = ja.iterator();
        while(itr2.hasNext()){
            itr = ((Map) itr2.next()).entrySet().iterator();
            while(itr.hasNext()){
                Map.Entry pair=itr.next();
                System.out.println(pair.getKey()+":"+pair.getValue());
            }
        }

        Map map=new HashMap();
        map=(Map)js.get("Address");
    }


    @Test
    public void jsonUpdate() throws Exception{
        String name= "Atul";
        File jsonFile = new File("C:\\Users\\Atul Sarathe\\IdeaProjects\\TestProject\\src\\test\\Resources\\jsonFileStore\\jsonExample");
        String jsonString= FileUtils.readFileToString(jsonFile);
        JsonElement jElement= new JsonParser().parse(jsonString);
        JsonObject jObject= jElement.getAsJsonObject();
        jObject.addProperty("firstName",name);
        Gson gson= new Gson();
        String resultingJson= gson.toJson(jElement);
        FileUtils.writeStringToFile(jsonFile,resultingJson);

    }
}
