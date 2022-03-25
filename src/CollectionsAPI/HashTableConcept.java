package CollectionsAPI;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableConcept {

    public static void main(String[] args) {

        Hashtable ht=new Hashtable();

        ht.put("Name","Mohan");
        ht.put("Location","NZ");
        ht.put("Profession","IT");

        System.out.println(ht.size());
       Collection m= ht.values();
       Iterator it=m.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }





    }
}
