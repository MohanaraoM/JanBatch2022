package FileHandling;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileInputStream;

public class CreateJSON {

    public static void main(String[] args) {
        JSONObject user1=new JSONObject();
        user1.put("Browser","Chrome");
        user1.put("FirstName","Mohan");
        System.out.println(user1.toJSONString());

        JSONObject user2=new JSONObject();
        user2.put("Browser","Firefox");
        user2.put("FirstName","TestUser");

        System.out.println(user2.toJSONString());

        JSONArray details=new JSONArray();
        details.add(user1);
        details.add(user2);
        System.out.println(details.toJSONString());

       JSONObject RegistrationDetails=new JSONObject();
       RegistrationDetails.put("registrationdetails",details);
        System.out.println(RegistrationDetails.toJSONString());


    }

}
