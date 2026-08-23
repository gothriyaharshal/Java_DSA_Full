package twoDArray;

public class LinkedList {
   static Node head = null;

    public static void insertion(int data)
    {
        Node n = new Node(data);

        if(head==null)
        {
            head=n;
            return;
        }

        Node temp = head;
        while (temp.node!=null)
        {
            temp = temp.node;
        }
        temp.node=n;


    }



    public static void print() {
        Node temp = head;

        while (temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.node;
        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.insertion(1);
        LinkedList.insertion(2);

        print();
    }
}
