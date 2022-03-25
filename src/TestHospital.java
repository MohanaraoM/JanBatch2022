public class TestHospital {

    public static void main(String[] args) {

        Hospital fh=new FortisHospital();
        fh.doOperate();
        fh.doScan();

        GovtHospital gh=new GovtHospital();
        gh.doOperate();
        gh.doVaccinate();


    }
}
