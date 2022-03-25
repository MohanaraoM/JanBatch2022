public class Module3FBPage {
    String pageName; //Non-Static Variable
    int pageViews; //Non-static variable
    static String owner; //static variable

    public void printPageDetails() {  //Non-static function

        System.out.println(pageName+"--"+pageViews);
    }

    public static void printompanyDetails() { //static function
        System.out.println(owner);
    }
}
