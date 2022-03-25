public class EnMain {

    public static void main(String[] args) {

        EnSub en=new EnSub();
        System.out.println(en.getI());
        en.setI(5);
        System.out.println(en.getI());
    }
}
