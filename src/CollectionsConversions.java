import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student
{
    Integer id ;
    String name;

    Student(Integer id , String name )
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id+"---->"+this.name;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return this.id;
    }


    public void setName(String name)
    {
        this.name  = name;
    }

    public String getName()
    {
        return this.name;
    }


}

void main() {
    System.out.println("Hyy");

   List<Integer> list = new ArrayList<>();

   for (int i = 0 ; i<=5 ; i++)
   {
       list.add(i);
   }

   //first we print forward
   /* Iterator<Integer> iterator = list.iterator();
   while (true)
   {
       if (!iterator.hasNext()) break;
       System.out.print(iterator.next());
   }*/
   //now we prints backward
/*

    ListIterator<Integer> listing =  list.listIterator(list.size());
   while (listing.hasPrevious())
   {
       System.out.println(listing.previous());
   }*/

   Student student = new Student(1,"Amit");
    Student student2 = new Student(2,"afd");
    Student student3 = new Student(3,"asf");
    Student student4 = new Student(4,"asdf");
    Student student6 = new Student(5,"asf");
    Student student7 = new Student(6,"adsf");




    List<Student> list1 = new ArrayList<>();/*
    list1.addAll(student,student2,student3,student,student5,student6,student7);
*/

    list1.add(student);
    list1.add(student2);
    list1.add(student3);
    list1.add(student4);
    list1.add(student6);
    list1.add(student7);


    Iterator<Student> iterator = list1.iterator();
   while (true)
   {
       if (!iterator.hasNext()) break;
       System.out.println(iterator.next());
   }



    //i want to convert this into Hashmap

    Map<Integer, String> collect = list1.stream().collect(Collectors.toMap(student1 -> student1.id, student1 -> student1.name));

    for( Map.Entry<Integer,String> entries :  collect.entrySet())
    {
        System.out.println(entries.getValue()+"----> " + entries.getKey());
    }
    //now i want to convert this list into hashmap


    //now what is here i have an collect type of hashmap where did i have all list data i want to convert back into list

  List<Integer> arr = new ArrayList<Integer> (collect.keySet());




}
