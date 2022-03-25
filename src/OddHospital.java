public abstract class OddHospital implements Hospital {


    @Override
    public void doOperate() {

    }

    @Override
    public abstract void doScan() ;

    @Override
    public void doVaccinate() {

        System.out.println("odd Hospital is vaccinating");

    }


}
