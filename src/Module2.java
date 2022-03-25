public class Module2 {
    static int age; //static variable
    int q; //Non-Static variable

    public static void main(String[] args) {

        printMe();
        scanMe();
        scanMe();
        scanMe();
        sumAll(5,8,9);
        sumAll(5,8);
    }

    public static void printMe() {   //Static method
        System.out.println("Print Me");
    }

    public static void scanMe(){
        System.out.println("Scan Me");
    }

    public static void sumAll(int a,int b, int c){
        int sumAll=a+b+c;
        System.out.println(sumAll);
    }


    public static int sumAll(int a, int b){
        int sumAll=a+b;
        return sumAll;
    }

    public void sample(){  //Non-static method

    }






}
