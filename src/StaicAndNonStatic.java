public class StaicAndNonStatic {
    int age; //Non-Static variable
    static String ownername; //static variable

    public static void main(String[] args) {

        StaicAndNonStatic sn=new StaicAndNonStatic();
        sn.sum(); //non-static
        email(); //static
        sn.age=55; //non-static
        ownername="Mohan"; //static

    }

    public void sum(){  //Non-static method

        System.out.println("sum of numbers");
    }

    public static void email(){

        System.out.println("email");

    }



}
