package FileHandling;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingJSON {

    public static void main(String[] args) throws IOException, ParseException {

        String jsonFilePath=System.getProperty("user.dir")+"\\TestData.json";
        System.out.println(jsonFilePath);

        FileReader fr=new FileReader(jsonFilePath);

        JSONParser parser=new JSONParser();
       JSONObject details= (JSONObject) parser.parse(fr);
        System.out.println(details.toJSONString());




    }
}
