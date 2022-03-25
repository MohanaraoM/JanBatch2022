package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    public static void main(String[] args) throws IOException {

        Properties prop=new Properties();

        String path="C:\\Users\\jashm\\Documents\\JanBatch2022\\src\\FileHandling\\CommontTestData.properties";

        FileInputStream fs=new FileInputStream(path);

        prop.load(fs);

        System.out.println(prop.getProperty("URL"));
        System.out.println(prop.get("Environment"));



    }
}
