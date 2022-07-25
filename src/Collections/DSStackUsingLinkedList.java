package Collections;

public class DSStackUsingLinkedList {

    Node head;

    class Node{
        int data;
        Node next;
    }

    DSStackUsingLinkedList(){
        head=null;
    }

    //push element at the beginning of ll
    public void pushElement(int data){
        Node storehead=head;   //store the head ptr to point to the new node
        Node newNode = new Node(); //create new node
        newNode.data=data;
        head=newNode;              //point head to new node
        newNode.next=storehead;    //point previous head to new node's next pointer
    }

    //pop element as Last in first out - pop beginning value in list
    public  int popElement(){

        try{
        if(head==null){
            System.out.println("Head is null");
        }
        }
        catch (NullPointerException e) {
            System.out.println("head null");
        }
        int value=head.data;
        head=head.next;
        return value;
    }

    public static void main(String[] args) {
        DSStackUsingLinkedList stackUsingLinkedList=new DSStackUsingLinkedList();
        stackUsingLinkedList.pushElement(10);
        stackUsingLinkedList.pushElement(20);

        System.out.println(stackUsingLinkedList.popElement());
        System.out.println(stackUsingLinkedList.popElement());

    }
}
