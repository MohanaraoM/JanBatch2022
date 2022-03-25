package CollectionsAPI;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

    public static void main(String[] args) {

        HashSet hs=new HashSet();

        hs.add("Mango");
        hs.add("Apple");
        hs.add("Mango");

        System.out.println(hs.size());

          Iterator it=hs.iterator(); //imp

          while(it.hasNext()){
            System.out.println(it.next());

        }



    }
}
