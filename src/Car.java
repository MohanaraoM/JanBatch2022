public class Car {
    String mod; //non-static Global variable
    int price; //Global
    static int wheels; //static Global variable

    public static void main(String[] args) {

        Car c1=new Car();
        c1.mod="merc";
        c1.price=99999;
        System.out.println(c1.mod);
        System.out.println(c1.price);

        Car c2=new Car();
        c2.mod="maruthi";
        c2.price=5555;
        System.out.println(c2.mod);
        System.out.println(c2.price);
        c1.start();
        c1.acc();

        Car d=new Car("BMW",67777);


    }

    public void start(){

        int localvar=0;  //local variable
        System.out.println("starting the car");
    }

    public void acc(){

        System.out.println("accelarte the car with speed 180 km");
    }

    public Car(){  //default constructor

        System.out.println("printing the car");
    }

    public Car(String m,int p){

        this.mod=m;
        this.price=p;

    }
}
