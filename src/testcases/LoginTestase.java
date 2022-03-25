package testcases;


import TestDataReadingFiles.ExcelReadingFile;

public class LoginTestase extends ExcelReadingFile {

    public static void main(String[] args) {
        LoginTestase lt=new LoginTestase();
        //ExcelReadingFile xlsRead=new ExcelReadingFile();
       lt.readCellData();
        System.out.println(lt.xlsLocation);


    }
}
