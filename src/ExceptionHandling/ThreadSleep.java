package ExceptionHandling;

public class ThreadSleep {

    public static void main(String[] args) throws InterruptedException {

        int i=10;
        System.out.println(i);
        Thread.sleep(1000);
        int j=20;
        throw new InterruptedException("something went wrong");
    }

    public void sampletest()  {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
