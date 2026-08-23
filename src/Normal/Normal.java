package Normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Normal implements  Comparable<Normal>{

    private Integer id;
    private String name;

    Normal(Integer id , String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+"="+name;
    }

    public int compareTo(Normal normal)
    {
        int result =  Integer.compare(this.id,normal.id);

        if(result==0)
        {
           result = this.name.compareTo(normal.name);
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Normal> arrayList = new ArrayList<>();
        arrayList.add(new Normal(1,"B"));
        arrayList.add(new Normal(2,"A"));

        Collections.sort(arrayList);

       Iterator iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
