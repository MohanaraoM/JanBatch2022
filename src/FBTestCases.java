public class FBTestCases {

    public static void main(String[] args) {

        Module3FBPage fb= new Module3FBPage();
        fb.pageName="HomePage";
        fb.pageViews=100;
        fb.printPageDetails();

        System.out.println(Module3FBPage.owner);


        Module3FBPage fb1= new Module3FBPage();
        fb1.pageName="ProfilePage";
        fb1.pageViews=200;
        fb1.printPageDetails();

        System.out.println( fb.pageName);
        System.out.println(fb.pageViews);

        System.out.println( fb1.pageName);
        System.out.println(fb1.pageViews);

    }


}
