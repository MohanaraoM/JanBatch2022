import java.sql.SQLOutput;
import java.util.Arrays;

public class Module1 {
//Type PSVM and Tab
    public static void main(String[] args) {
        //Type SOUT and Tab
        System.out.println("Java is easy");
        System.out.print("Selenium is easy");
        System.out.println("Core  is easy");

        //a)int

        int i = 10;
        System.out.println(i);

        //b)long

        long l = 1999999;
        System.out.println(l);

        //c)double

        double d = 19.99;

        System.out.println(d);

        //d)char

        char c = 'e';
        System.out.println(c);

        //e)boolean

        boolean b = true;

        System.out.println(b);


        //String

        String str = "sdasdaf22424324@@#$$$$";
        System.out.println(str);

        //conditional operator

        int x=2;
        int y=1;

        System.out.println(x!=y);
         //&& operator
        int temp=22;

        boolean isWarm=temp>20 && temp<30;
        System.out.println(isWarm);

        //Concatenation operator

        String k="Hello";
        String m="World";
        int q=100;
        int r=200;

        System.out.println(k+m); //HelloWorld
        System.out.println(q+r); //300
        System.out.println(k+m+q+r); //Hello+World+100+200 =HelloWorld+100+200=HelloWorld100+200=HelloWorld100200
        System.out.println(k+m+(q+r)); // Hello+World+(100+200)=Hello+World+300//HelloWorld+300=HelloWorld300
        System.out.println(q+r+k+m); // 100+200+Hello+World=300+Hello+World=300Hello+World=300HelloWorld


        //if statement

      if(q<r) {
          System.out.println("Pass");
      }

     // if else

        int z=100;
        int v=200;

        if(z>v) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        //Ternary Operator ?

        String status= z>v ? "pass" : "fail";
        System.out.println(status);



        //Nested if

        int a1=100;
        int b1=300;
        int c1=200;

        if(a1>b1&&a1>c1) {
            System.out.println("a1 is the greatest number");
        } else if(b1>a1&&b1>c1) {
            System.out.println("b1 is greatest number");
        } else {
            System.out.println("c1 is greatest number");
        }

        //Switch

        String role="admi";

        switch(role) {
            case "admin" :
                System.out.println("i am admin");
            break;
            case "moderator":
                System.out.println("i am a moderator");
            break;
            default:
                System.out.println("you are guest");
        }




        //print 0 to 9 using while loop

        int w1=0;  //intialization
        while(w1<10){ //condition
            System.out.println(w1);  //code
            w1=w1+1; //increment part
        }

        //print 0 to 9 using for loop

        for(int f1=0;f1<10;f1++){
            System.out.println(f1);

        }


        //print 0 to 9 numbers using while loop

        int n=0; //initilization part
        while(n<10){
            System.out.println(n);
           n=n+1;
        }


        //print 0 to 9 numbers using for loop

        for(int num=0;num<10;num++){
            System.out.println(num);
        }

      //Arrays

        String[] fruits=new String[3];
        fruits[0]="Mango";
        fruits[1]="Apple";
        fruits[2]="Orange";
        //fruits[3]="Grapes";

        for(int h=0;h<fruits.length;h++){
            System.out.println(fruits[h]);
        }

        //second way of array

        String[] fruites={"Mango","Apple","Orange"};
        for(String fruit:fruites) {
            System.out.println(fruit);
        }

        int[] nubr={1,2,4,7,9};
        for(int nb:nubr) {
            System.out.println(nb);
        }





        int[] p=new int[4];
        p[0]=10;

        Object ar[]=new Object[4];
        ar[0]=10;
        ar[1]="Java";
        ar[2]=12.34;
        ar[3]=true;

        for(int s=0;s<ar.length;s++){
            System.out.println(ar[s]);
        }

        String[][] xyz=new String[3][3];
        int[][] nbrs={{1,2,3},{7,8,9}};
        String[][] byd={{"abc","tyu"},{"opi","tyz"}};

      //final
        final double pi=3.14;
        System.out.println(pi);

        //Casting  --Implicit casting & Explicit casting

        //byte>short>int>long>double


        short k1=1;
        int k2=k1+1;
        System.out.println(k2);


        int k7=5;
        short k8= (short) (k7+10);
        System.out.println("The value of K8 is : " + k8);

        String p1="9";

        int p2=Integer.parseInt(p1)+10;

        System.out.println("The value of p2 is : " + p2);





    }

}
