public class FortisHospital implements Hospital {

    public void doOperate(){
        System.out.println("Fortis Hospital is Operating");
    }

    public void doScan(){
        System.out.println("Fortis Hospital is scanning");
    }

    @Override
    public void doVaccinate() {

        System.out.println("Fortis vaccinating");

    }

    @Override
    public void doCovidTest() {
        System.out.println("fortis is doing covid test");
    }


}
