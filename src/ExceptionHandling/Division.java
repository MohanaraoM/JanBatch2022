package ExceptionHandling;

public class Division {

    public static void main(String[] args) {

         System.out.println("A");
         try{
             int i=2/0;
             System.out.println("B");
         }catch (Exception e){
             System.out.println(e.getMessage());
         }
         finally {
             System.out.println("close DB connection");
         }
        System.out.println("C");
    }


}
