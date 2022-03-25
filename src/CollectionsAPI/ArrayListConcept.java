package CollectionsAPI;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args) {


        ArrayList list=new ArrayList();

        list.add("Mango"); //index 0
        list.add("Apple");
        list.add("Mango");
        list.add(true);

        System.out.println(list.get(0));
        System.out.println("sample");
        System.out.println("The size of array list is :" + list.size());

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }






    }
}
