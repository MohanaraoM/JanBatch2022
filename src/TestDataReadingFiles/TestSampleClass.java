package TestDataReadingFiles;

public class TestSampleClass {

    public static void main(String[] args) {
        ExcelReadingFile xlsReader=new ExcelReadingFile();
        xlsReader.readCellData();
        System.out.println(xlsReader.xlsLocation);
    }
}
