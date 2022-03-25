public class GovtHospital implements Hospital {


    @Override
    public void doOperate() {

        System.out.println("Govt Hospital is Operating");

    }

    @Override
    public void doScan() {

        System.out.println("Govt Hospital is Scanning");

    }

    @Override
    public void doVaccinate() {

        System.out.println("Govt Hospital is Vaccination");

    }

    @Override
    public void doCovidTest() {
        System.out.println("Govt Hospital is doing covid Test");
    }
}
