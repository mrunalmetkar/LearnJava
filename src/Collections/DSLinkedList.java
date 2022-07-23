package Collections;

public class DSLinkedList
{
    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void printLinkedList()
    {
        Node n=head;
        while (n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }
    public static void main(String[] args)
    {
        DSLinkedList linkedList=new DSLinkedList();
        Node first=linkedList.new Node(10);
        linkedList.head=first;

        Node second=linkedList.new Node(20);
        first.next=second;

        Node third=linkedList.new Node(30);
        second.next=third;

        linkedList.printLinkedList();
    }

    //LL is a default class in java
    //dynamic collection
    //manipulation is fast
    //allows null entries
    //not thread safe
    //can have duplicate values
    //internally maintains doubly linked list
}
