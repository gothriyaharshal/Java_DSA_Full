package AllPattern.Number_Pattern;

public class LinkedListq {
   static Node head=null;

    public static void inserstion(int data)
    {
        AllPattern.Number_Pattern.Node n = new AllPattern.Number_Pattern.Node(data);

        if(head == null)
        {
          head=n;
          return;
        }

        Node temp = head;
        while (temp.next!=null)
        {
            temp = temp.next;

        }
        temp.next  = n;
    }


    public static void print()
    {
        Node temp = head;

        while(temp.next!=null)
        {
            System.out.print(temp.data+"   ");
            temp = temp.next;

        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
      LinkedListq.inserstion(1);
      LinkedListq.inserstion(2);
      LinkedListq.inserstion(3);

      print();

    }
}
